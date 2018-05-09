package com.yongdubot.server.service;

import com.yongdubot.server.domain.Match;

public interface MatchService {
//	경기 등록
	int registerMatch(Match match);
	
//	경기 참석 여부 등록(참석, 보류, 불참)
	int registerAttendance(String attend);
	
//	경기 참석 여부 수정
	int updateAttendance(String attend);
}
