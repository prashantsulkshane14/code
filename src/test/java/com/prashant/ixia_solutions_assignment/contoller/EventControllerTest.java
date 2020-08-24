package com.prashant.ixia_solutions_assignment.contoller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.prashant.ixia_solutions_assignment.controller.EventController;
import com.prashant.ixia_solutions_assignment.model.Event;
import com.prashant.ixia_solutions_assignment.service.EventService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = EventController.class)
public class EventControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private EventService eventService;

	@Test
	public void retrieveEventByCategoryWithParameter() throws Exception {

		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);

		List<Event> eventList = Arrays.asList(
				new Event("70c89dda-35ca-43d0-911e-f780127161a6", "Undergraduate Open House", "Alex Guillou",
						LocalDateTime.parse("2020-08-24T12:00:00Z", inputFormatter),
						LocalDateTime.parse("2020-08-24T14:00:00Z", inputFormatter), "Orientation"));

		Mockito.when(eventService.getEventByCategory(Mockito.anyString())).thenReturn(eventList);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/events").accept(MediaType.APPLICATION_JSON)
				.param("category", "Orientation");

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(result.getResponse());
		String expected = "[{\n" + 
				"        \"id\": \"70c89dda-35ca-43d0-911e-f780127161a6\",\n" + 
				"        \"eventName\": \"Undergraduate Open House\",\n" + 
				"        \"host\": \"Alex Guillou\",\n" + 
				"        \"startTime\": \"2020-08-24T12:00:00\",\n" + 
				"        \"endTime\": \"2020-08-24T14:00:00\",\n" + 
				"        \"category\": \"Orientation\"\n" + 
				"    }]";

		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
	}

	@Test
	public void retrieveEventByCategory_WithNullParameter() throws Exception {

		List<Event> eventList = Arrays.asList();

		Mockito.when(eventService.getEventByCategory(Mockito.anyString())).thenReturn(eventList);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/events").accept(MediaType.APPLICATION_JSON)
				.param("category", "");

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(result.getResponse());
		String expected = "[]";

		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
	}
	
	@Test
	public void retrieveHostOfEvent() throws Exception {

		
		List<String> hostList = Arrays.asList( "Ahsan Patel",
			    "Alex Guillou",
			    "Kiona Perez",
			    "Shanda Girard",
				"Kiona Perez");

		Mockito.when(eventService.getEventHost()).thenReturn(hostList);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/hosts").accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(result.getResponse());
		String expected = "[\"Ahsan Patel\",\n" + 
				"			    \"Alex Guillou\",\n" + 
				"			    \"Kiona Perez\",\n" + 
				"			    \"Shanda Girard\",\n" + 
				"				\"Kiona Perez\"]";

		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
	}

}
