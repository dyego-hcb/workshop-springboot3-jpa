package com.zebodexxsz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zebodexxsz.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
