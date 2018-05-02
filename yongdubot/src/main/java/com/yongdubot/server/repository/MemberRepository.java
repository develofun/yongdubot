package com.yongdubot.server.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yongdubot.server.domain.Members;

@Repository
public class MemberRepository {
	private static final String NAMESPACE = "com.yongdubot.server.mapper.MemberMapper.";
	
	@Autowired
	private SqlSession sqlSession;
	
	public int save(Members member) {
		return sqlSession.insert("saveMember" + member);
	}
}
