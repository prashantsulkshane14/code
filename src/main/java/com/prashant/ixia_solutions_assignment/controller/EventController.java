package com.prashant.ixia_solutions_assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prashant.ixia_solutions_assignment.model.Event;
import com.prashant.ixia_solutions_assignment.service.EventService;


@RestController
@RequestMapping("api")
public class EventController {
	
	@Autowired
	EventService eventService;

	@GetMapping("/events")
	public List<Event> getEventByCategory(@RequestParam(name ="category")String category) {
		
		return eventService.getEventByCategory(category);
	}
	
	@GetMapping("/hosts")
	public List<String> getEventByCategory() {
		
		return eventService.getEventHost() ;
	}
}
