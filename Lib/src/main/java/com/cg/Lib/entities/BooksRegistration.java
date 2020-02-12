package com.cg.Lib.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class BooksRegistration {

	@Id	
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqT")
	private int registrationId;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="bookId")
	private Books books;
	private int userId;
	private String registrationdate;
	public int getRegistrationId() {
		return registrationId;
	}

	
	

	public int getUserId() {
		return userId;
	}




	public void setUserId(int userId) {
		this.userId = userId;
	}




	public String getRegistrationdate() {
		return registrationdate;
	}


	public void setRegistrationdate(String registrationdate) {
		this.registrationdate = registrationdate;
	}


	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}
	

	
	
}
