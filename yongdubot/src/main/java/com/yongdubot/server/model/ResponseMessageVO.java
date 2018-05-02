package com.yongdubot.server.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseMessageVO {
	private MessageVO messageVO;
	private KeyboardVO keyboardVO;
}
