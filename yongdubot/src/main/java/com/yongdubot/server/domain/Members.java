package com.yongdubot.server.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Members {
	private int code;
	private String name;
	private String user_key;
	private String nickname;
	private String level;
}
