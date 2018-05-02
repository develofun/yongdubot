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
public class Match {
	private int year;
	private int month;
	private int day;
	private int attend;
	private int check;
	private int absense;
	private String ground_name;
	private String ground_location;
}
