package com.rohit26.BookDetails.handler;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.rohit26.BookDetails.exception.AuthenticationException;
import com.rohit26.BookDetails.exception.BadRequestException;
import com.rohit26.BookDetails.exception.BookException;
import com.rohit26.BookDetails.exception.NotFoundException;

@RestControllerAdvice
public class BookExceptionHandler {
  
  @ExceptionHandler(value= {NotFoundException.class})
  public ResponseEntity<Object> handleGetBookException(NotFoundException e){
    
    BookException exception = new BookException(e.getMessage(), HttpStatus.NOT_FOUND,LocalDateTime.now(),e);
   
    return new ResponseEntity<>(exception,exception.getHttpStatus());
  }
  
  @ExceptionHandler(value= {BadRequestException.class})
  public ResponseEntity<Object> handlebadRequestException(BadRequestException e){
    
    BookException exception = new BookException(e.getMessage(), HttpStatus.BAD_REQUEST,LocalDateTime.now(),e);
   
    return new ResponseEntity<>(exception,exception.getHttpStatus());
  }
  
  @ExceptionHandler({ AuthenticationException.class })
  public ResponseEntity<String> handleAuthenticationException(AuthenticationException e) {
    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
  }
}
