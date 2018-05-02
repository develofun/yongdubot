package com.yongdubot.server.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yongdubot.server.domain.Members;

@Service
public interface MemberService{
	int save(Members member);
	int update(Members member);
	Members findByUserkey(String user_key);
	List<Members> findAll();
}
