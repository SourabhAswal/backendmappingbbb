package com.CodingBootCamp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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

import com.CodingBootCamp.model.LoggedInUsers;
import com.CodingBootCamp.model.User;
import com.CodingBootCamp.service.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/users")
public class RegistrationAndLoginController {

	@Autowired
	private UserService userService;
	private static final Logger logger = LoggerFactory.getLogger(RegistrationAndLoginController.class);

	@PostMapping("/process_register")
	public String processRegister(@RequestBody User user, HttpServletRequest request) {
		logger.info("user registered");
		System.out.println(getSiteURL(request));
		return userService.register(user, getSiteURL(request));

	}

	public String getSiteURL(HttpServletRequest request) {
		logger.info("site url converted to string");
		String siteURL = request.getRequestURL().toString();
		System.out.println(siteURL.replace(request.getServletPath(), ""));
		return siteURL.replace(request.getServletPath(), "");

	}

	@GetMapping("/registered_users")
	public List<User> getRegisteredUser() {
		logger.info("get registereded User");
		return userService.getRegisteredUsers();
	}

	@GetMapping("/registered_users/{meeting_id}")
	public List<User> getById(@PathVariable("meeting_id") Long meeting_id) {
		return userService.getUserById(meeting_id);
	}

	@PostMapping("/loginUser/{meeting_id}")
	public String login(@RequestBody User user, @PathVariable("meeting_id") Long meeting_id) {
		logger.info("user logged in");
		return userService.login(user, meeting_id);
	}

	@PostMapping("/email/{mid}")
	public String emailExist(@RequestBody User user, @PathVariable("mid") Long mid) {
		logger.info("Email Exists");

		return userService.emailExist(user, mid);
	}


	@GetMapping("/loggedin_users")
	public List<LoggedInUsers> getLoggedInUser() {
		logger.info("get registereded User");
		return userService.getLoggedInUser();
	}

	@GetMapping("/loggedin_users/{meeting_id}")
	public List<LoggedInUsers> getLoggedInUserByMId(@PathVariable("meeting_id") Long meeting_id) {
		return userService.getLoggedInUserByMId(meeting_id);
	}



}
