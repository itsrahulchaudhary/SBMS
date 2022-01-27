package in.rahulit.service;

import java.util.stream.Stream;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.rahulit.response.Covid19DataResponse;



@Service
public class Covid19Service {
	
	public void getCovid19Data() {
		String endpointUrl="https://covid-19-data.p.rapidapi.com/country/code?code=IN";
		
		WebClient webClient = WebClient.create();
		Covid19DataResponse[] response = webClient.get()
		.uri(endpointUrl)
		.header("x-rapidapi-host", "covid-19-data.p.rapidapi.com")
		.header("x-rapidapi-key", "7068879f1cmsh17f1535387fa001p10269djsn21a3f6867ed2")
		.retrieve()
		.bodyToMono(Covid19DataResponse[].class)
		.block();
		 Stream.of(response).forEach(System.out::println);
 		//System.out.println(block);
	}

}
