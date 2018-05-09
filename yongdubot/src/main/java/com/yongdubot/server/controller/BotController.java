package com.yongdubot.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yongdubot.server.common.ConstValues;
import com.yongdubot.server.domain.Members;
import com.yongdubot.server.model.Keyboard;
import com.yongdubot.server.model.Message;
import com.yongdubot.server.model.RequestMessage;
import com.yongdubot.server.model.ResponseMessage;
import com.yongdubot.server.service.MemberService;

@RestController
public class BotController {

	@Autowired
	private MemberService memberService;
	
	@PostMapping("/friend")
	public void addFriend(@RequestParam("user_key") String user_key) {
		// 카카오 플러스 친구 추가 시 유저 등록
		Members member = new Members();
		
		member.setUser_key(user_key);
		member.setLevel(ConstValues.AUTHORITY_AGENT);
		
		memberService.insertMember(member);
	}
	
	@GetMapping("/keyboard")
	public Keyboard getKeyboard() {
		return new Keyboard("buttons", 
				new String[]{
					ConstValues.MENU_ATTENDANCE,
					ConstValues.MENU_CHECK_ATTENDANCE,
					ConstValues.MENU_MY_INFORMATION 
					});
	}
	
	@PostMapping("/message")
	public ResponseMessage message(@RequestBody RequestMessage request) {
		System.out.println("processing" + request.toString());
		
		return getResponseMessage(request.getContent());
	}
	
	@DeleteMapping("/friend/{user_key}")
	public void deleteFriend(@PathVariable("user_key") String user_key) {
		memberService.dropMember(user_key);
	}
	
	private ResponseMessage getResponseMessage(String requestContent) {		
		ResponseMessage responseMessage = new ResponseMessage();
		Message message = new Message();
		
		if(requestContent.equals(ConstValues.MENU_ATTENDANCE)) {
			message.setText("참석 여부를 체크해 주세요.");
			responseMessage.setKeyboard(new Keyboard("buttons", 
				new String[]{
					ConstValues.BUTTON_ATTENDANCE_ATTEND, 
					ConstValues.BUTTON_ATTENDANCE_POSTPONE, 
					ConstValues.BUTTON_ATTENDANCE_ABSENT
					}
			));
		} else if(requestContent.equals(ConstValues.BUTTON_ATTENDANCE_ATTEND) ||
				requestContent.equals(ConstValues.BUTTON_ATTENDANCE_POSTPONE) ||
				requestContent.equals(ConstValues.BUTTON_ATTENDANCE_ABSENT)) {
			
			
			
			message.setText("[" + requestContent + "]을 선택하셨습니다.");
			
		} else if(requestContent.indexOf("메인") > -1) {
			message.setText("메인 메뉴를 호출합니다.");
			responseMessage.setKeyboard(new Keyboard("buttons", 
				new String[]{
					ConstValues.MENU_ATTENDANCE, 
					ConstValues.MENU_CHECK_ATTENDANCE,
					ConstValues.MENU_MY_INFORMATION 
					}));
		}
		
		responseMessage.setMessage(message);
		return responseMessage;
	}
	
}
