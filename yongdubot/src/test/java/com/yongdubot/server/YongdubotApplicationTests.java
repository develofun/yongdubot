package com.yongdubot.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yongdubot.server.domain.Members;
import com.yongdubot.server.service.MemberService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YongdubotApplicationTests {
	@Autowired
	private MemberService service;
		
	@Test
	public void insertMember() {
		Members member = new Members();
		member.setUser_key("k123");
		service.insertMember(member);

	}
}
