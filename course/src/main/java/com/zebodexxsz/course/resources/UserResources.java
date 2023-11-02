package com.zebodexxsz.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zebodexxsz.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "123456789", "12345");
		
		return ResponseEntity.ok().body(u);
	}
}
