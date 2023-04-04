package com.javaguide.respository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.javaguide.model.Books;
@Repository
public interface BooksRepository extends JpaRepository<Books, Integer>{

}
