package com.yongdubot.autoreply.vo;

import java.util.Arrays;

public class KeyboardVO {
	private String type;
	private String[] buttons;
	
	public KeyboardVO() {}

	public KeyboardVO(String type, String[] buttons) {
		super();
		this.type = type;
		this.buttons = buttons;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String[] getButtons() {
		return buttons;
	}
	public void setButtons(String[] buttons) {
		this.buttons = buttons;
	}
	
	@Override
	public String toString() {
		return "KeyboardVO [type=" + type + ", buttons=" + Arrays.toString(buttons) + "]";
	}
	
}
