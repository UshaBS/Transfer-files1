package com.cg.Lib.service;

import java.util.List;

import com.cg.Lib.entities.Books;
import com.cg.Lib.entities.BooksRegistration;

public interface IStudentsService {

	public List<Books> get(String genre, String author, String publisher);
	
	public List<Books> getAllBooks();

	public Books addBooks(Books book);

	public BooksRegistration addBooksRegistration(BooksRegistration booksRegistration);

	
	
	
}
