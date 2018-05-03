package com.yongdubot.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yongdubot.server.domain.Members;
import com.yongdubot.server.mappers.MemberMapper;

@Repository
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public int insertMember(Members member) {
		return memberMapper.insertMember(member);
	}

	@Override
	public int updateMember(Members member) {
		if(member.getName() != "") {
			memberMapper.updateMemberName(member);
		} else if(member.getNickname() != "") {
			memberMapper.updateMemberNickName(member);
		}
		return 0;
	}

	@Override
	public Members findMemberByUserkey(String user_key) {
		return memberMapper.findMemberByUserkey(user_key);		
	}

	@Override
	public int dropMember(String user_key) {
		return memberMapper.dropMember(user_key);
	}

}
