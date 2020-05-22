package com.rohit26.BookDetails.exception;

public class AuthenticationException extends RuntimeException {
  public AuthenticationException(String message, Throwable cause) {
      super(message, cause);
  }
}