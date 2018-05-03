package com.yongdubot.server.service;

import org.springframework.stereotype.Service;
import com.yongdubot.server.domain.Members;

@Service
public interface MemberService{
//	멤버 등록
	int insertMember(Members member);
	
//	내 정보 업데이트
	int updateMember(Members member);
	
//	내 정보 확인
	Members findMemberByUserkey(String user_key);
	
//	멤버 탈퇴 처리(실제 삭제는 아님)
	int dropMember(String user_key);
}
