package com.cg.Lib;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.cg.Lib.entities.Books;
import com.cg.Lib.repository.BooksRepository;
import com.cg.Lib.service.LibraryService;

@RunWith(MockitoJUnitRunner.class)
public class LibraryTest {
	
	@Mock
	private BooksRepository libraryRepository;

	@InjectMocks
	private LibraryService libraryService;

	@Test
	public void getBooksByidTest() {

		Books booksInventoryExpected = new Books();

		booksInventoryExpected.setAuthor("author");
		booksInventoryExpected.setAuthor2("author2");
		booksInventoryExpected.setBookId(1);
		booksInventoryExpected.setBookName("bookName");
		booksInventoryExpected.setGenre("genre");
		booksInventoryExpected.setPublisher("publisher");
		booksInventoryExpected.setYearOfPublisher("Year");

		when(libraryRepository.getOne(1)).thenReturn(booksInventoryExpected);

		Books BooksInventoryActual = libraryService.getBooksByid(booksInventoryExpected.getBookId());

		System.out.println(booksInventoryExpected.toString());
		System.out.println(BooksInventoryActual.toString());
		assertEquals(booksInventoryExpected, BooksInventoryActual);

	}

	@Test
	public void updateBooksTest() {
		
		Books booksInventoryExpected = new Books();
		booksInventoryExpected.setAuthor("author");
		booksInventoryExpected.setAuthor2("author2");
		booksInventoryExpected.setBookId(1);
		booksInventoryExpected.setBookName("bookName");
		booksInventoryExpected.setGenre("genre");
		booksInventoryExpected.setPublisher("publisher");
		booksInventoryExpected.setYearOfPublisher("Year");
		
		when(libraryRepository.getOne(Mockito.anyInt())).thenReturn(booksInventoryExpected);
		
		/*
		 * Books BooksInventoryActual = new Books();
		 * BooksInventoryActual.setAuthor("authorxxxxxx");
		 * BooksInventoryActual.setAuthor2("author2");
		 * BooksInventoryActual.setBookId(1);
		 * BooksInventoryActual.setBookName("bookName");
		 * BooksInventoryActual.setGenre("genre");
		 * BooksInventoryActual.setPublisher("publisher");
		 * BooksInventoryActual.setYearOfPublisher("Year");
		 */
		
		Books BooksInventoryActual = libraryService.updateBooks(booksInventoryExpected,booksInventoryExpected.getBookId());
		
		assertEquals(booksInventoryExpected, BooksInventoryActual);
		
	}
	
}
