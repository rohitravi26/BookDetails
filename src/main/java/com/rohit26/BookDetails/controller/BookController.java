package com.rohit26.BookDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rohit26.BookDetails.entity.Book;
import com.rohit26.BookDetails.exception.BookException;
import com.rohit26.BookDetails.exception.NotFoundException;
import com.rohit26.BookDetails.service.BookService;

@RestController
public class BookController {
  
  @Autowired
  private BookService bookService;
  
  @GetMapping(value = "/books/{id}")
  public Book getBook(@PathVariable int id)   {
   Book book = null;
   
   book = bookService.getBook(id);
  
   return book;
  }
  
  @GetMapping(value = "/admin")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public String checkadminAccess()   {
     
   return "abcd";
  }
  
  @PostMapping(value="/books")
  public ResponseEntity<Book> updateBook(@RequestBody Book book) {
    
    return bookService.addBook(book);
  }
  
 @PutMapping(value="/books/{id}")
 public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book book) {
   
   return bookService.updateBook(book);
 }
}
