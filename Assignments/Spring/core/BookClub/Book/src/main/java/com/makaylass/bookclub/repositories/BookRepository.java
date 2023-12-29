package com.makaylass.bookclub.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.makaylass.bookclub.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
    // this method retrieves all the books from the database
    List<Book> findAll();
    // this method finds books with descriptions containing the search string
    List<Book> findByTitleContaining(String search);
    // this method counts how many names contain a certain string
    Long countByTitleContaining(String search);
    // this method deletes a book that starts with a specific name
    Long deleteByTitleStartingWith(String search);
}

