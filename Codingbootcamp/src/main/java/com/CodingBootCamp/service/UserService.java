package com.CodingBootCamp.service;

import java.util.List;

import com.CodingBootCamp.model.LoggedInUsers;
import com.CodingBootCamp.model.User;

public interface UserService {
	public String login(User user,Long meeting_id);
   
    public String emailExist(User user,Long meeting_id);
	public String register(User user, String siteURL);

	public List<User> getRegisteredUsers();
	public boolean verify(String verificationCode);
	 public List<User> getUserById(Long id);
	 
	 public List<LoggedInUsers> getLoggedInUser();
	 public List<LoggedInUsers> getLoggedInUserByMId(Long meeing_id);
}
