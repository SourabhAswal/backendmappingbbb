package com.CodingBootCamp.service;

import java.util.List;

import com.CodingBootCamp.model.Feedback;

public interface FeedbackService {

	List<Feedback> showFeedback();

	void storeFeedback(Feedback feedback);
	List<Feedback> getFeedbackByEventId(Long meeting_id);

}
