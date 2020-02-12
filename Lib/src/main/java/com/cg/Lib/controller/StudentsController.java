package com.cg.Lib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Lib.entities.Books;
import com.cg.Lib.entities.BooksRegistration;
import com.cg.Lib.service.IStudentsService;

@RestController
public class StudentsController {
	
	@Autowired
	private IStudentsService studentsService;
	
	
	/*--------- Adding details of books----------- */

	@RequestMapping(value = "/books", method = RequestMethod.POST)
	public Books addBooks(@RequestBody Books book) {
		return studentsService.addBooks(book);
		

	}
	
	
	
	/*--------- Retrieving List of All books------------ */

	@RequestMapping("/Allbooks")
	public List<Books> getAllBooks() {
		return studentsService.getAllBooks();
	}

	
	/*--------- Retrieving Books, Filter list with genre, publisher or any other parameters------------ */

	@RequestMapping("/books")
	public List<Books> findBooks(@RequestParam(required = false) String genre,

			@RequestParam(required = false) String author,

			@RequestParam(required = false) String publisher) {
		return studentsService.get(genre, author, publisher);
	}
	/****************Place a request for a particular book by Id***********************/
	/*--------- Book Registration------------ */
	
	@RequestMapping(value = "/BooksRegistration" , method = RequestMethod.POST)
public BooksRegistration addBooksRegistration(@RequestBody BooksRegistration booksRegistration) {
	return studentsService.addBooksRegistration(booksRegistration);

}
		
}
