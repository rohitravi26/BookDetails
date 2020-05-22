package com.rohit26.BookDetails.service;

import org.springframework.http.ResponseEntity;
import com.rohit26.BookDetails.entity.Book;
import com.rohit26.BookDetails.exception.NotFoundException;

public interface BookService {
  
  public Book getBook(int id)   ;
  public ResponseEntity<Book> addBook(Book book);
  public ResponseEntity<Book> updateBook(Book book)  ;
  
}
