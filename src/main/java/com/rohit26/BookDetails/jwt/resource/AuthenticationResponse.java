package com.rohit26.BookDetails.jwt.resource;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable {
  
  private static final long serialVersionUID = -4301171477380291558L;
  private final String token;

  public AuthenticationResponse(String token) {
      this.token = token;
  }

  public String getToken() {
      return this.token;
  }
}
