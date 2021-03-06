package in.rahulit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
	
	@PutMapping("/customer/{cId}")
	public ResponseEntity<String> updateCustomer(@PathVariable Integer cId){
		// logic to update customer
		String msg =" Customer record updated successfully";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	@DeleteMapping("/customer/{cId}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Integer cId){
		// logic to delete customer
		String msg =" Customer record deleted successfully";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
}
