package com.rohit26.BookDetails.exception;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import org.springframework.http.HttpStatus;
import com.fasterxml.jackson.annotation.JsonFormat;

public class BookException {
  private String message;
  private HttpStatus httpStatus;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
  private LocalDateTime timestamp;
  private Throwable throwable;
  
  public BookException(
      String message, HttpStatus httpStatus, LocalDateTime timestamp, Throwable throwable) {
    super();
    this.message = message;
    this.httpStatus = httpStatus;
    this.timestamp = timestamp;
    this.throwable = throwable;
  }

  public String getMessage() {
  return message;}

  public void setMessage(String message) {
  this.message = message;}

  public HttpStatus getHttpStatus() {
  return httpStatus;}

  public void setHttpStatus(HttpStatus httpStatus) {
  this.httpStatus = httpStatus;}

  public LocalDateTime getTimestamp() {
  return timestamp;}

  public void setTimestamp(LocalDateTime timestamp) {
  this.timestamp = timestamp;}

  public Throwable getThrowable() {
  return throwable;}

  public void setThrowable(Throwable throwable) {
  this.throwable = throwable;}
  
  
  
}
