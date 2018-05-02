package com.yongdubot.server;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yongdubot.server.controller.BotController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BotControllerTests {

	@Autowired
	private BotController controller;
	
	@Test
	public void addFriendTest() {
		controller.addFriend("k123");
	}
	
	@Test
	public void getKeyboardTest() {
		System.out.println(controller.getKeyboard().toString());
	}

}
