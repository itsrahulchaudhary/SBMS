package in.rahulit.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.rahulit.binding.Book;

@RestController
public class BookRestController {

	@GetMapping(value = "/book/{isbn}", produces = "application/json")
	public Book getBookInfo(@PathVariable("isbn") String isbn) {
		// logic
		Book b = new Book(isbn, "spring", 300.00, "Rod Johnson");
		Link withRel = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookRestController.class).getAllBooks())
				.withRel("All-Books");
		b.add(withRel);
		return b;
	}

	@GetMapping(value="/books", produces = "application/json")
	public List<Book> getAllBooks() {
		Book b1 = new Book("ISBN001", "Spring", 300.00, "Rod Johnson");
		Book b2 = new Book("ISBN001", "Spring Boot", 400.00, "Rod Johnson");
		Book b3 = new Book("ISBN001", "Spring Cloud", 900.00, "Rod Johnson");

		List<Book> books = new ArrayList<>();
		books.add(b1);
		books.add(b2);
		books.add(b3);

		return books;

	}

}
