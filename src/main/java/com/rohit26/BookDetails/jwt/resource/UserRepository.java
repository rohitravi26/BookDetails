package com.rohit26.BookDetails.jwt.resource;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rohit26.BookDetails.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
