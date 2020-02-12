package com.cg.Lib.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Books {
	
		@Id	
		@Column(name="bookId")
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqT")
		private int bookId;
		private  String bookName;
		private String author;
		private String author2;
		private String genre;
		private String publisher;
		private String yearOfPublisher;
		
		@OneToMany(mappedBy = "books")
		private List<BooksRegistration> booksRegistration;

		public int getBookId() {
			return bookId;
		}

		public void setBookId(int bookId) {
			this.bookId = bookId;
		}

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getAuthor2() {
			return author2;
		}

		public void setAuthor2(String author2) {
			this.author2 = author2;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public String getPublisher() {
			return publisher;
		}

		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}

		public String getYearOfPublisher() {
			return yearOfPublisher;
		}

		public void setYearOfPublisher(String yearOfPublisher) {
			this.yearOfPublisher = yearOfPublisher;
		}
		
		
		
		
		
		
}


