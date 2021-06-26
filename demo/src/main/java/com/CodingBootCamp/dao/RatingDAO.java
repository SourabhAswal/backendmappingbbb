package com.CodingBootCamp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.CodingBootCamp.model.Rating;




public interface RatingDAO extends JpaRepository<Rating, Long> {
	@Query("SELECT r FROM Rating r WHERE r.meeting_id = ?1")
	public List<Rating> findByMeetingId(Long id);
}
