package in.rahulit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.rahulit.response.QuoteResponse;
import in.rahulit.service.QuoteClientService;

@RestController
public class QuoteRestController {
	
	@Autowired
	QuoteClientService service;
	
	@GetMapping("/quote")
	public QuoteResponse getRandomQuote() {
		return service.invokeRandomQuoteApi();
	}

}
