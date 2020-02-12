package com.cg.Lib.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Lib.entities.Books;
import com.cg.Lib.entities.BooksRegistration;
import com.cg.Lib.repository.BookTransactionRepository;
import com.cg.Lib.repository.BooksRegistrationRepository;
import com.cg.Lib.repository.BooksRepository;

@Service
public class StudentsService implements IStudentsService{
	
	@Autowired
	private BooksRepository booksRepository;
	
	
	@Autowired
	private BooksRegistrationRepository booksRegistrationRepository; 
	
	
	
	/************************************************* * Students Should be able to ***********************************************/
	

	public List<Books> getAllBooks() {
		
		return booksRepository.findAll();
	}



	public List<Books> get(String genre, String author, String publisher) {
		
		return booksRepository.findBooks(genre, author, publisher);
	}



	@Override
	public Books addBooks(Books book) {	
		return booksRepository.save(book);
	}



	@Override
	public BooksRegistration addBooksRegistration(BooksRegistration booksRegistration) {
		booksRegistration.setBooks(booksRepository.getOne(booksRegistration.getBooks().getBookId()));
		return booksRegistrationRepository.save(booksRegistration);
	}


	}



	





	

	
	
	
	
	

