package com.rohit26.BookDetails.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.rohit26.BookDetails.entity.Book;
import com.rohit26.BookDetails.exception.BadRequestException;
import com.rohit26.BookDetails.exception.NotFoundException;
import com.rohit26.BookDetails.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book getBook(int id) {

        Optional<Book> book = bookRepository.findById(id);
        if (book.isPresent())
            return book.get();
        else
            throw new NotFoundException("Requested id: " + id + "is not available in the database");
    }

    @Override
    public ResponseEntity<Book> updateBook(Book bk) {

        Optional<Book> bookOptional = bookRepository.findById(bk.getId());
        boolean isPresent = bookOptional.isPresent();
        if (isPresent) {
            bookRepository.save(bk);
            return new ResponseEntity<>(bk, HttpStatus.OK);
        } else {
            throw new NotFoundException("Requested id: " + bk.getId() + "is not available in the database");
        }

    }

    @Override
    public ResponseEntity<Book> addBook(Book book) {

        if (book.getName().isBlank()) {
            throw new BadRequestException("Book Name should not be blank");
        }
        Book bk = bookRepository.save(book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }
}
