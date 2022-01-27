package in.rahulit.service;

 
 
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.rahulit.response.Flight;
import in.rahulit.response.Flights;

@Service
public class FlightService {
	
	public void getUnitedFlights() {
		
		RestTemplate restTemplate = new RestTemplate();
		String url="http://mu.mulesoft-training.com/essentials/united/flights/";
		
		/* Approach-1
		ResponseEntity<String> entity = restTemplate.getForEntity(url, String.class);
		String body = entity.getBody();
		System.out.println(body);
		*/
		
		/* Approach-2
		ResponseEntity<Flights> forEntity = restTemplate.getForEntity(url, Flights.class);
		Flights body = forEntity.getBody();
		List<Flight> flights = body.getFlights();
		flights.forEach(System.out::println);
		
		*/
		
		// Approach-3
		 HttpHeaders headers=new HttpHeaders();
		 // Case-1
		 // headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		 
		 // Case-2
		 headers.add("Accept", "application/json");
		HttpEntity entity = new HttpEntity<>(headers); 
		ResponseEntity<Flights> resEntity = restTemplate.exchange(url, HttpMethod.GET, entity, Flights.class);
		Flights body = resEntity.getBody();
		List<Flight> flights = body.getFlights();
		flights.forEach(System.out::println);
		
	}
	
    
   

}
