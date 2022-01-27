package in.rahulit.service;

 
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.rahulit.request.PassengerRequest;
import in.rahulit.response.TicketResponse;

@Service
public class TicketBookingClientService {
	
	public void invokeTicketBookingAPI() {
		String endpointUrl="http://localhost:8080/bookTicket";
		
		PassengerRequest requestData = new PassengerRequest("Rahul", "Chaudhary", "Lko", "Bang", "20-Oct-2021");
		WebClient webClient = WebClient.create();
		TicketResponse response = webClient.post()
		         .uri(endpointUrl)
		         .body(BodyInserters.fromValue(requestData))
		         .accept(MediaType.APPLICATION_JSON)
		         .retrieve()
		         .bodyToMono(TicketResponse.class)
		         .block();
		System.out.println("Response : "+response);
		
	}

}
