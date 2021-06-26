package com.CodingBootCamp;

import static org.junit.jupiter.api.Assertions.*;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.CodingBootCamp.controller.RegistrationAndLoginController;
import com.CodingBootCamp.model.ScheduleMeeting;
import com.CodingBootCamp.model.User;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@Transactional
class UserTest {
	
	@Autowired
	RegistrationAndLoginController controller;
	
	@Test
	public void testloginuser() {
		User u=new User();
		u.setContact("123");
		u.setEmail("abc@gmail.com");
		u.setUserName("sourabh");
		assertEquals("123",u.getContact());
		assertEquals("abc@gmail.com",u.getEmail());
		Long meetid=123L;
		controller.login(u, meetid);
		
		
	}
	
	
	@Test
	public void testregistrationuser() {
		
		User u=new User();
		u.setContact("1234");
		u.setUserName("Sourabh");
		u.setEmail("abc@gmail.com");
		assertEquals("1234", u.getContact());
		assertEquals("Sourabh",u.getUserName());
		assertEquals("abc@gmail.com",u.getEmail());
		
		
	}



}

