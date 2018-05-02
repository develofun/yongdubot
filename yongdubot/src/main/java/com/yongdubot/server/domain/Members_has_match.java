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
public class Members_has_match {
	private int members_code;
	private String members_name;
	private String members_user_key;
	private int match_year;
	private int match_month;
	private int match_day;
}
