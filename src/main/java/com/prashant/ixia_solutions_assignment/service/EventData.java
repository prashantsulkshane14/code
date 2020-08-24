package com.prashant.ixia_solutions_assignment.service;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.prashant.ixia_solutions_assignment.model.Event;

public class EventData {

	public static List<Event> getEventData() {
		
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
		
		return Arrays.asList(
				new Event("38d3081d-afa2-460b-81ed-edd79e6059c3", "Freshman Orientation","Ahsan Patel",LocalDateTime.parse("2020-08-18T12:00:00Z",inputFormatter),LocalDateTime.parse("2020-08-18T14:00:00Z",inputFormatter), "Orientation"),
				new Event("286b8b1d-693d-42d6-b63e-ffb13cbeb97a", "Freshman Orientation","Ahsan Patel",LocalDateTime.parse("2020-08-19T12:00:00Z",inputFormatter),LocalDateTime.parse("2020-08-19T14:00:00Z",inputFormatter), "Orientation"),
				new Event("059e98e7-3cc1-452f-ac63-c9915430945a", "Freshman Orientation","Alex Guillou",LocalDateTime.parse("2020-08-20T12:00:00Z",inputFormatter),LocalDateTime.parse("2020-08-20T14:00:00Z",inputFormatter), "Orientation"),
				new Event("79e71deb-0c72-4815-8c34-e647478e2c45", "Freshman Orientation","Kiona Perez",LocalDateTime.parse("2020-08-21T12:00:00Z",inputFormatter),LocalDateTime.parse("2020-08-21T14:00:00Z",inputFormatter), "Orientation"),
				new Event("5ca0e3e2-05e5-4f44-93b5-faa884c95901", "Campus Tour","Alex Guillou",LocalDateTime.parse("2020-08-22T12:00:00Z",inputFormatter),LocalDateTime.parse("2020-08-22T14:00:00Z",inputFormatter), "Orientation"),
				new Event("b00e21af-14ff-41f6-a6aa-cae6dab9d74e", "School of Business Open House","Shanda Girard",LocalDateTime.parse("2020-08-23T12:00:00Z",inputFormatter),LocalDateTime.parse("2020-08-23T14:00:00Z",inputFormatter), "Information"),
				new Event("70c89dda-35ca-43d0-911e-f780127161a6", "Undergraduate Open House","Alex Guillou",LocalDateTime.parse("2020-08-24T12:00:00Z",inputFormatter),LocalDateTime.parse("2020-08-24T14:00:00Z",inputFormatter), "Orientation"),
				new Event("d9facd40-07e3-4d4a-b735-e96345ebb0b7", "Campus Tour","Alex Guillou",LocalDateTime.parse("2020-08-25T12:00:00Z",inputFormatter),LocalDateTime.parse("2020-08-25T14:00:00Z",inputFormatter), "Information"),
				new Event("4910dce4-6a28-4ff4-9534-09bc32e7f80d", "Information Session: Undergraduate Admissions","Kiona Perez",LocalDateTime.parse("2020-08-26T12:00:00Z",inputFormatter),LocalDateTime.parse("2020-08-26T14:00:00Z",inputFormatter), "Information"),
				new Event("55bb0fda-889d-47d6-a5ff-218fd45c4c8b", "Campus Tour","Ahsan Patel",LocalDateTime.parse("2020-08-27T12:00:00Z",inputFormatter),LocalDateTime.parse("2020-08-27T14:00:00Z",inputFormatter), "Information"),
				new Event("88f311a1-02bd-4d05-be97-6b7cb77ea1a3", "Information Session: Undergraduate Admissions","Alex Guillou",LocalDateTime.parse("2020-08-28T12:00:00Z",inputFormatter),LocalDateTime.parse("2020-08-28T14:00:00Z",inputFormatter), "Tour"),
				new Event("2e5c40a7-d95b-4dbf-bf75-0b784d65db79", "Information Session: Graduate Admissions","Kiona Perez",LocalDateTime.parse("2020-08-29T12:00:00Z",inputFormatter),LocalDateTime.parse("2020-08-29T14:00:00Z",inputFormatter), "Information"),
				new Event("1f6d3356-7023-44d7-b483-d52252ea28c8", "Campus Tour","Ahsan Patel",LocalDateTime.parse("2020-08-30T12:00:00Z",inputFormatter),LocalDateTime.parse("2020-08-30T14:00:00Z",inputFormatter), "Tour"),
				new Event("7661c55b-2ffb-4656-b27a-b9b17af0f740", "Information Session: Campus Tech","Kiona Perez",LocalDateTime.parse("2020-09-01T12:00:00Z",inputFormatter),LocalDateTime.parse("2020-09-01T14:00:00Z",inputFormatter), "Information"),
				new Event("7d1b04d9-119c-47e2-98fa-1dab3288b769", "Information Session: Graduate Admissions","Ahsan Patel",LocalDateTime.parse("2020-09-02T12:00:00Z",inputFormatter),LocalDateTime.parse("2020-09-02T14:00:00Z",inputFormatter), "Information")
			);
			
	}

}
