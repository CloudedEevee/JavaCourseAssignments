package com.makaylass.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.makaylass.relationships.models.Dojo;
import com.makaylass.relationships.repositories.DojoRepository;

@Service
public class DojoService {
    // adding the dojo repository as a dependency
    private final DojoRepository dojoRepository;
    
    public DojoService(DojoRepository dojoRepository) {
        this.dojoRepository = dojoRepository;
    }
    // returns all the dojos
    public List<Dojo> allDojos() {
        return dojoRepository.findAll();
    }
    // creates / edits an dojo
    public Dojo createDojo(Dojo e) {
        return dojoRepository.save(e);
    }
    // deletes an dojo
    public void deleteDojo(Long id) {
    	dojoRepository.deleteById(id);
    }
    // retrieves an dojo
    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo = dojoRepository.findById(id);
        if(optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }
}
