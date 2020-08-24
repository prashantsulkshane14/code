package com.prashant.ixia_solutions_assignment.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.prashant.ixia_solutions_assignment.model.Event;

@Service
public class EventService {

	public List<Event> getEventByCategory(String category) {

		return EventData.getEventData().stream().filter(event -> event.getCategory().equalsIgnoreCase(category))
				.collect(Collectors.toList());
	}

	public List<String> getEventHost() {

		return EventData.getEventData().stream().map(e -> e.getHost()).collect(Collectors.toList());

	}
}
