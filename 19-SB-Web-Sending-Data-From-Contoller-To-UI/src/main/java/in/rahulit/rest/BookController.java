package in.rahulit.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.rahulit.model.Book;

@Controller
public class BookController {

	@GetMapping("/book")
	public String getBookData(Model model) {
		Book bookObj = new Book(101, "Spring", 455.00);
		model.addAttribute("book", bookObj);
		return "book";

	}

	@GetMapping("/books")
	public String getBook(Model model) {

		Book bookObj1 = new Book(101, "Spring", 455.00);
		Book bookObj2 = new Book(102, "Spring Boot", 515.10);
		Book bookObj3 = new Book(103, "MicroServices", 655.31);

		List<Book> booksList = new ArrayList<>();
		booksList.add(bookObj1);
		booksList.add(bookObj2);
		booksList.add(bookObj3);

		model.addAttribute("books", booksList);

		return "books";

	}

}
