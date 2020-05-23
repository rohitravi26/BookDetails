package com.rohit26.BookDetails.service;

import org.springframework.http.ResponseEntity;
import com.rohit26.BookDetails.entity.Book;
import com.rohit26.BookDetails.exception.NotFoundException;

public interface BookService {
  
  Book getBook(int id)   ;
  ResponseEntity<Book> addBook(Book book);
  ResponseEntity<Book> updateBook(Book book)  ;
  
}
