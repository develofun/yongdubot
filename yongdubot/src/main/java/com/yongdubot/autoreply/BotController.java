package com.yongdubot.autoreply;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yongdubot.autoreply.common.ConstValues;
import com.yongdubot.autoreply.vo.KeyboardVO;
import com.yongdubot.autoreply.vo.MessageVO;
import com.yongdubot.autoreply.vo.RequestMessageVO;
import com.yongdubot.autoreply.vo.ResponseMessageVO;

@RestController
public class BotController {

	@PostMapping("/friend")
	public void addFriend(@RequestParam("user_key") String user_key) {
		// 유저 등록
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
		
		ResponseMessageVO responseMessageVO = new ResponseMessageVO();
		MessageVO messageVO = new MessageVO();
		
		if(vo.getContent().equals(ConstValues.MENU_ATTENDANCE)) {
			messageVO.setText("참석 여부를 체크해 주세요.");
			responseMessageVO.setKeyboardVO(new KeyboardVO("buttons", 
				new String[]{
					ConstValues.BUTTON_ATTENDANCE_ATTEND, 
					ConstValues.BUTTON_ATTENDANCE_POSTPONE, 
					ConstValues.BUTTON_ATTENDANCE_ABSENT
					}
			));
		} else if(vo.getContent().equals(ConstValues.MENU_CHECK_ATTEDANT_LIST)) {
			
		} else if(vo.getContent().equals(ConstValues.MENU_CHECK_ATTENDANCE)) {
			
		} else if(vo.getContent().equals(ConstValues.BUTTON_ATTENDANCE_ATTEND)) {
			
		} else if(vo.getContent().equals(ConstValues.BUTTON_ATTENDANCE_POSTPONE)) {
			
		} else if(vo.getContent().equals(ConstValues.BUTTON_ATTENDANCE_ABSENT)) {
			
		} else if(vo.getContent().indexOf("메인") > -1) {
			messageVO.setText("메인 메뉴를 호출합니다.");
			responseMessageVO.setKeyboardVO(new KeyboardVO("buttons", 
				new String[]{
					ConstValues.MENU_ATTENDANCE, 
					ConstValues.MENU_CHECK_ATTEDANT_LIST, 
					ConstValues.MENU_CHECK_ATTENDANCE
					}));
		}
				
		return responseMessageVO;
	}
	
	@DeleteMapping("/friend/{user_key}")
	public void deleteFriend(@PathVariable("user_key") String user_key) {
		// 유저 삭제
	}
}
