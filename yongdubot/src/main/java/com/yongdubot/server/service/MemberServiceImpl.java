package com.yongdubot.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.yongdubot.server.domain.Members;
import com.yongdubot.server.mappers.MemberMapper;
import com.yongdubot.server.repository.MemberRepository;

@Repository
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public int save(Members member) {
		return memberMapper.insertMember(member);
	}

	@Override
	public int update(Members members) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Members findByUserkey(String user_key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Members> findAll() {
		return memberMapper.findAllMembers();
	}

}
