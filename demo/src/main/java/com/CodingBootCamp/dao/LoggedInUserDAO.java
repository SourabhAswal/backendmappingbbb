package com.CodingBootCamp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.CodingBootCamp.model.LoggedInUsers;

public interface LoggedInUserDAO  extends JpaRepository<LoggedInUsers, Long>{
	@Query("SELECT u FROM LoggedInUsers u WHERE u.meeting_id = ?1")
	public List<LoggedInUsers> findByMeetingId(Long id);

}
