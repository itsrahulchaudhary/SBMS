package in.rahulit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import in.rahulit.response.QuoteResponse;
 
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		RestTemplate restTemplate = new RestTemplate();
		String url="https://quoters.apps.pcfone.io/api/random";
		
		/*
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
		String body = responseEntity.getBody();
		System.out.println(body);

		*/
		
		ResponseEntity<QuoteResponse> entity = restTemplate.getForEntity(url, QuoteResponse.class);
		QuoteResponse body = entity.getBody();
		System.out.println(body);
		

		
		 
		
	}

}
