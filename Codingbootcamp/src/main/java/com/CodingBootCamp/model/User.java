package com.CodingBootCamp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	private String contact;
	private Long meeting_id;
	private String userName;
	private String verificationCode;
	private boolean enabled;

	public User(Long id, String email, String contact, Long meeting_id, String userName, String verificationCode,
			boolean enabled) {
		super();
		this.id = id;
		this.email = email;
		this.contact = contact;
		this.meeting_id = meeting_id;
		this.userName = userName;
		this.verificationCode = verificationCode;
		this.enabled = enabled;
	}

	public Long getMeeting_id() {
		return meeting_id;
	}

	public void setMeeting_id(Long meeting_id) {
		this.meeting_id = meeting_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public User() {
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
