package in.rahulit.service;

import org.springframework.stereotype.Service;

import in.rahulit.request.Passenger;
import in.rahulit.response.Ticket;

@Service
public class TicketBookingService {

	public Ticket bookTicket(Passenger passenger) {
		System.out.println(passenger);

		// logic to book ticket
		
		Ticket t = new Ticket();
		t.setPnr("123456");
		t.setTicketStatus("CONFIRMED");
		t.setTicketPrice("780.00");

		return t;
	}

}
