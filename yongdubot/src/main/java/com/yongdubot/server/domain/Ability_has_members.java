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
public class Ability_has_members {
	private String ability_name;
	private String ability_type;
	private int members_code;
	private String members_name;
	private String members_user_key;
}
