package com.CodingBootCamp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.CodingBootCamp.model.Feedback;

public interface FeedbackDAO extends JpaRepository<Feedback, Long>{
	@Query("SELECT f FROM Feedback f WHERE f.meeting_id = ?1")
	public List<Feedback> findByMeetingId(Long id);
}
