package com.rohit26.BookDetails.controller;

import com.rohit26.BookDetails.entity.Book;
import com.rohit26.BookDetails.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/books/{id}")
    public Book getBook(@PathVariable int id) {
        return bookService.getBook(id);
    }

    /**/
    @GetMapping(value = "/admin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String checkadminAccess() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
        // return "abcd";
    }

    @PostMapping(value = "/books")
    public ResponseEntity<Book> updateBook(@RequestBody Book book) {

        return bookService.addBook(book);
    }

    @PutMapping(value = "/books/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book book) {

        return bookService.updateBook(book);
    }
}
