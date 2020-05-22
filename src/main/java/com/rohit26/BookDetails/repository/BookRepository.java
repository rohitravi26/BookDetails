package com.rohit26.BookDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rohit26.BookDetails.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{}
