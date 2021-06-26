package com.CodingBootCamp;

import static org.junit.jupiter.api.Assertions.*;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.CodingBootCamp.model.ScheduleMeeting;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@Transactional
class ScheduleMeetingTest {

	@Test
	void test() {
		ScheduleMeeting meet=new ScheduleMeeting();
		meet.setMeeting_id("123");
		meet.setMeeting_name("bootcamp");
		meet.setId(123L);
		meet.setModeratorPswd("mpass");
		meet.setModerator_link("mlink");
		meet.setAttendee_link("alink");
		meet.setAttendeePswd("apass");
		assertEquals(123L,meet.getId());
		assertEquals("123",meet.getMeeting_id());
		assertEquals("bootcamp",meet.getMeeting_name());
		assertEquals("mpass",meet.getModeratorPswd());
		assertEquals("mlink",meet.getModerator_link());
		assertEquals("apass",meet.getAttendeePswd());
		assertEquals("alink",meet.getAttendee_link());
	}

}
