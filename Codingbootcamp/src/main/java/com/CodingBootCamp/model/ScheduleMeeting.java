package com.CodingBootCamp.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class ScheduleMeeting {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;

	@JsonFormat(pattern = "HH:mm")
	private LocalTime start_time;

	@JsonFormat(pattern = "HH:mm")
	private LocalTime end_time;

	private String meeting_link;
	
	private String moderator_link;
	
	private String attendeePswd;
	
	private String moderatorPswd;
	
	private String meeting_name;
	private String meeting_id;
	
	public ScheduleMeeting(long id, LocalDate date, LocalTime start_time, LocalTime end_time, String meeting_name,String attendeePswd, String moderatorPswd,String meeting_id) {
		super();
		this.id = id;
		this.date = date;
		this.start_time = start_time;
		this.end_time = end_time;
		this.meeting_name = meeting_name;
		this.attendeePswd=attendeePswd;
		this.moderatorPswd=moderatorPswd;
		this.meeting_id=meeting_id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getStart_time() {
		return start_time;
	}

	public void setStart_time(LocalTime start_time) {
		this.start_time = start_time;
	}

	public LocalTime getEnd_time() {
		return end_time;
	}

	public void setEnd_time(LocalTime end_time) {
		this.end_time = end_time;
	}

	public String getMeeting_link() {
		return meeting_link;
	}

	public void setMeeting_link(String meeting_link) {
		this.meeting_link = meeting_link;
	}
	
	

	public ScheduleMeeting() {
		
	}

	public String getMeeting_name() {
		return meeting_name;
	}

	public void setMeeting_name(String meeting_name) {
		this.meeting_name = meeting_name;
	}

	public String getAttendeePswd() {
		return attendeePswd;
	}

	public void setAttendeePswd(String attendeePswd) {
		this.attendeePswd = attendeePswd;
	}

	public String getModeratorPswd() {
		return moderatorPswd;
	}

	public void setModeratorPswd(String moderatorPswd) {
		this.moderatorPswd = moderatorPswd;
	}

	public String getMeeting_id() {
		return meeting_id;
	}

	public void setMeeting_id(String meeting_id) {
		this.meeting_id = meeting_id;
	}

	public String getModerator_link() {
		return moderator_link;
	}

	public void setModerator_link(String moderator_link) {
		this.moderator_link = moderator_link;
	}
	
	
}
