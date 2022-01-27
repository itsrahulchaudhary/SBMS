package in.rahulit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.rahulit.response.QuoteResponse;
@Service
public class QuoteClientService {

	public QuoteResponse invokeRandomQuoteApi() {
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://quoters.apps.pcfone.io/api/random";

		/*
		 * ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class); 
		 * String body = responseEntity.getBody();
		 * System.out.println(body);
		 * 
		 */

		ResponseEntity<QuoteResponse> entity = restTemplate.getForEntity(url, QuoteResponse.class);
		QuoteResponse body = entity.getBody();
		return body;
	}

}
