package com.CodingBootCamp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CodingBootCamp.model.Feedback;
import com.CodingBootCamp.service.FeedbackService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/feedback")
public class FeedbackController {

	@Autowired
	private FeedbackService feedbackService;
	private static final Logger logger = LoggerFactory.getLogger(FeedbackController.class);

	
	@GetMapping
	public List<Feedback> showFeedback(){
		logger.info("show feedback Called");
		System.out.println("hello there");
		return feedbackService.showFeedback();
	}
	
	@PostMapping("/submitFeedback")
	public void storeFeedback(@RequestBody Feedback feedback)
	{
		logger.info("Feedback stored");
		feedbackService.storeFeedback(feedback);
	}
	
	@GetMapping("/{meeting_id}")
	public List<Feedback> getFeedbackByEventId(@PathVariable("meeting_id")Long meeting_id){
		logger.info("show feedback Called");
		System.out.println("hello there");
		return feedbackService.getFeedbackByEventId(meeting_id);
	}
}
