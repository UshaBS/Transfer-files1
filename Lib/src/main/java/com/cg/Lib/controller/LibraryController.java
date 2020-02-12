package com.cg.Lib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Lib.entities.Books;
import com.cg.Lib.service.ILibraryService;
import com.cg.Lib.service.LibService;


@RestController
public class LibraryController {

	@Autowired
	private ILibraryService libraryService;
	
	@Autowired
	private LibService libService;


	@RequestMapping( value="/addbooks", method= RequestMethod.POST)
	public Books addBooks(@RequestBody Books book)  {
		return libraryService.addBooks(book);
		
					}

	/*--------- Retrieving Particular Book details based on Id------------ */

	@RequestMapping(value = "/getbooks/{bookId}", method = RequestMethod.GET)
	public Books getBooksByid(@PathVariable int bookId) {
		return libService.getBooksByid(bookId);
	}

	/*--------- Removing a Particular Book details based on Id------------ */

	@RequestMapping(value = "/deletebook/{bookId}", method = RequestMethod.DELETE)
	public void deleteBookDetails(@PathVariable int bookId) {
		libraryService.deleteBookDetails(bookId);
	}

	/*--------- Updating a particular book details------------ */

	@RequestMapping(value = "/updatebook/{bookId}", method = RequestMethod.PUT)
	public Books updateBooks(@RequestBody Books book, @PathVariable int bookId) {
		return libraryService.updateBooks(book,bookId);
	}
	
	
}

