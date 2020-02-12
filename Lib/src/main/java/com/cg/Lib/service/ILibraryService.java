package com.cg.Lib.service;

import com.cg.Lib.entities.Books;

public interface ILibraryService {

	
	public Books getBooksByid(int bookId);

	public void deleteBookDetails(int bookId);

	public Books updateBooks(Books book, int bookId);

	public Books addBooks(Books book);
	}
