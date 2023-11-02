package com.zebodexxsz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zebodexxsz.course.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
