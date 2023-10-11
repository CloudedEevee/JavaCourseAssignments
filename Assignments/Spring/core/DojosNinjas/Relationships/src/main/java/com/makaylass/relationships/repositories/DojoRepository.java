package com.makaylass.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.makaylass.relationships.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long>{
    // this method retrieves all the books from the database
    List<Dojo> findAll();
    // this method finds dojos with descriptions containing the search string
    List<Dojo> findByNameContaining(String search);
    // this method counts how many names contain a certain string
    Long countByNameContaining(String search);
    // this method deletes a dojo that starts with a specific name
    Long deleteByNameStartingWith(String search);
}