package com.rohit26.BookDetails;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.rohit26.BookDetails.entity.Book;
import com.rohit26.BookDetails.repository.BookRepository;
import com.rohit26.BookDetails.service.BookService;

@SpringBootTest
class BookDetailsApplicationTests {
//
//	@Test
//	void contextLoads() {
//	}

  @Autowired
  private BookRepository bookrepo;
  
  @Autowired
  private BookService bookservice;
  
  @Test
  void getBook() throws Exception {
    //Book book =bookrepo.findById(1).get();
    
    Book book = bookservice.getBook(1);
    
    System.out.println(book.getName() ); 
    
  }
}
