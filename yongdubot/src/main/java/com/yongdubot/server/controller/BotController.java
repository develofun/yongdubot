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
import com.yongdubot.server.model.KeyboardVO;
import com.yongdubot.server.model.MessageVO;
import com.yongdubot.server.model.RequestMessageVO;
import com.yongdubot.server.model.ResponseMessageVO;
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
	public KeyboardVO getKeyboard() {
		return new KeyboardVO("buttons", 
				new String[]{
					ConstValues.MENU_ATTENDANCE,
					ConstValues.MENU_CHECK_ATTEDANT_LIST, 
					ConstValues.MENU_CHECK_ATTENDANCE
					});
	}
	
	@PostMapping("/message")
	public ResponseMessageVO message(@RequestBody RequestMessageVO vo) {
		System.out.println("processing" + vo.toString());
		
		return getResponseMessage(vo.getContent());
	}
	
	@DeleteMapping("/friend/{user_key}")
	public void deleteFriend(@PathVariable("user_key") String user_key) {
		// 유저 삭제
	}
	
	private ResponseMessageVO getResponseMessage(String requestContent) {
		
		ResponseMessageVO responseMessageVO = new ResponseMessageVO();
		MessageVO messageVO = new MessageVO();
		
		if(requestContent.equals(ConstValues.MENU_ATTENDANCE)) {
			messageVO.setText("참석 여부를 체크해 주세요.");
			responseMessageVO.setKeyboardVO(new KeyboardVO("buttons", 
				new String[]{
					ConstValues.BUTTON_ATTENDANCE_ATTEND, 
					ConstValues.BUTTON_ATTENDANCE_POSTPONE, 
					ConstValues.BUTTON_ATTENDANCE_ABSENT
					}
			));
		} else if(requestContent.equals(ConstValues.MENU_CHECK_ATTEDANT_LIST)) {
			
		} else if(requestContent.equals(ConstValues.MENU_CHECK_ATTENDANCE)) {
			
		} else if(requestContent.equals(ConstValues.BUTTON_ATTENDANCE_ATTEND) ||
				requestContent.equals(ConstValues.BUTTON_ATTENDANCE_POSTPONE) ||
				requestContent.equals(ConstValues.BUTTON_ATTENDANCE_ABSENT)) {
			
		} else if(requestContent.indexOf("메인") > -1) {
			messageVO.setText("메인 메뉴를 호출합니다.");
			responseMessageVO.setKeyboardVO(new KeyboardVO("buttons", 
				new String[]{
					ConstValues.MENU_ATTENDANCE, 
					ConstValues.MENU_CHECK_ATTEDANT_LIST, 
					ConstValues.MENU_CHECK_ATTENDANCE
					}));
		}
		
		responseMessageVO.setMessageVO(messageVO);
		return responseMessageVO;
	}
	
}
