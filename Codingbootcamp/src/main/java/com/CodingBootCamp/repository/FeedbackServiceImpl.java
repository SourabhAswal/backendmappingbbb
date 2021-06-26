package com.CodingBootCamp.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CodingBootCamp.dao.FeedbackDAO;
import com.CodingBootCamp.model.Feedback;
import com.CodingBootCamp.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService {

	@Autowired
	private FeedbackDAO feedbackDAO;
	private static final Logger logger = LoggerFactory.getLogger(FeedbackServiceImpl.class);
	
	
	@Override
	public List<Feedback> showFeedback() {
		logger.info("feedback retrieved");
		
		System.out.println(feedbackDAO.findAll());
		return feedbackDAO.findAll();
	}

	@Override
	public void storeFeedback(Feedback feedback) {
		logger.info("feedback stored");
		feedbackDAO.save(feedback);
		
		
	}

	@Override
	public List<Feedback> getFeedbackByEventId(Long meeting_id) {
		
		return feedbackDAO.findByMeetingId(meeting_id);
	}

}
