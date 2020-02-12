package com.cg.Lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.Lib.entities.BooksRegistration;

@Repository
public interface BooksRegistrationRepository extends JpaRepository<BooksRegistration, Integer> {




	

}
