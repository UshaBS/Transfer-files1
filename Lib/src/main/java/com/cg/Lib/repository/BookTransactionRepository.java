package com.cg.Lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.Lib.entities.BooksTransaction;

@Repository
public interface BookTransactionRepository extends JpaRepository<BooksTransaction, Integer>{

}
