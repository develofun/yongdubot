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
import com.yongdubot.autoreply.vo.RequestMessageVO;

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
	public RequestMessageVO message(@RequestBody RequestMessageVO vo) {
		
		
		
		if(vo.getContent().equals(ConstValues.MENU_ATTENDANCE)) {
			
		} else if(vo.getContent().equals(ConstValues.MENU_CHECK_ATTEDANT_LIST)) {
			
		} else if(vo.getContent().equals(ConstValues.MENU_CHECK_ATTENDANCE)) {
			
		} else if(vo.getContent().equals(ConstValues.BUTTON_ATTENDANCE_ATTEND)) {
			
		} else if(vo.getContent().equals(ConstValues.BUTTON_ATTENDANCE_POSTPONE)) {
			
		} else if(vo.getContent().equals(ConstValues.BUTTON_ATTENDANCE_ABSENT)) {
			
		}
				
		return null;
	}
	
	@DeleteMapping("/friend/{user_key}")
	public void deleteFriend(@PathVariable("user_key") String user_key) {
		// 유저 삭제
	}
}
