package com.ltts.project.controller;



import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ltts.project.model.Exam;
import com.ltts.project.model.Shedule;



@RestController
public class Schedulecontroller {
	@Autowired
	RestTemplate rt;
	
	
	@RequestMapping("/schedule1")
	public List<Shedule> getExternalschedule(){
		/*
		 * //List<Team> li=new ArrayList<Team> List<Team>
		 * li=rt.getForObject("http://localhost:8080/teams", Team.class); return li;
		 * 
		 */
		
		/*
		 * ResponseEntity<List<Team>> responseEntity =
		 * rt.exchange("http://localhost:8080/teams", HttpMethod.GET, null, new
		 * ParameterizedTypeReference<List<Team>>() { }); List<Team> li =
		 * Arrays.asList(responseEntity.getBody()); return li;
		 */
		
		ResponseEntity<Shedule[]> response = 
				  rt.getForEntity(
				  "http://localhost:8090/schedule/",
				  Shedule[].class);
		Shedule[] ps = response.getBody();
				List<Shedule> lt=Arrays.asList(ps);
				
				//player
				//plist array
				
				//List<Player> plt=Arrays.asList(players);
				
				//List<Combined> comlist 
				//combine
				//return the combined list
				return lt;
		
}
}