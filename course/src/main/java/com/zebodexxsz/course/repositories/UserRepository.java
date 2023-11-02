package com.zebodexxsz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zebodexxsz.course.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
