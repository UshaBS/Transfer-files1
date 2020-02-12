package com.cg.Lib.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.Lib.entities.Books;


@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> {

	@Query("SELECT b from Books b where b.genre=:genre or b.author=:author or b.publisher=:publisher")

	List<Books> findBooks(@Param(value = "genre") String genre,

			@Param(value = "author") String author,

			@Param(value = "publisher") String publisher);
@Transactional
@Modifying
@Query("UPDATE Books b set b.bookName=:bookName, b.author=:author WHERE b.bookId=:bookId")
	int updateBooks(int bookId, String bookName, String author);

}
