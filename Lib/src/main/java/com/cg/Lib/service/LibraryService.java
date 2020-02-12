package com.cg.Lib.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.Lib.entities.Books;
import com.cg.Lib.repository.BooksRegistrationRepository;
import com.cg.Lib.repository.BooksRepository;

@Service

public class LibraryService implements ILibraryService {

	
	@Autowired
	private BooksRepository booksRepository;

	@Autowired
	private BooksRegistrationRepository bookRegistration;


	@Override
	 public Books getBooksByid(int bookId) {
	 
	 if (ValiadateBookId(bookId)) return booksRepository.getOne(bookId); 
	 else 
		 return null;
	 }
	 

	public boolean ValiadateBookId(int bookId) {
		Optional<Books> book = booksRepository.findById(bookId);
		if (book != null)
			return true;
		else
			return false;
	}

	/***********************************************
	 * Librarian should be able to
	 ***************************************************/

	/*--------- Removing a Particular Book details based on Id------------ */

	@Override
	public void deleteBookDetails(int bookId) {
		if (ValiadateBookId(bookId))
			booksRepository.deleteById(bookId);

	}

	/*--------- Updating a particular book details------------ */

	@Override
	public Books updateBooks(Books book,int bookId) {
		Books existingBook=booksRepository.getOne(bookId);
		book.setBookId(bookId);
		BeanUtils.copyProperties(book, existingBook);
		int status=booksRepository.updateBooks(bookId,existingBook.getBookName(),existingBook.getAuthor());
		return booksRepository.getOne(bookId);
		}

	@Override
	public Books addBooks(Books book) {
		return booksRepository.save(book);
	}

	
}
