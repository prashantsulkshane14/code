package com.prashant.ixia_solutions_assignment.model;

import java.time.LocalDateTime;
import java.util.Date;

public class Event {

	private String id;
	private String eventName;
	private String host;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private String category;

	public Event(String id, String eventName, String host, LocalDateTime startTime, LocalDateTime endTime,
			String category) {
		super();
		this.id = id;
		this.eventName = eventName;
		this.host = host;
		this.startTime = startTime;
		this.endTime = endTime;
		this.category = category;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", eventName=" + eventName + ", host=" + host + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", category=" + category + "]";
	}

}
