package com.makaylass.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.makaylass.relationships.models.Ninja;
import com.makaylass.relationships.repositories.NinjaRepository;

@Service
public class NinjaService {
    // adding the ninja repository as a dependency
    private final NinjaRepository ninjaRepository;
    
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }
    // returns all the ninjas
    public List<Ninja> allNinjas() {
        return ninjaRepository.findAll();
    }
    // creates / edits an ninja
    public Ninja createNinja(Ninja e) {
        return ninjaRepository.save(e);
    }
    // deletes an ninja
    public void deleteNinja(Long id) {
    	ninjaRepository.deleteById(id);
    }
    // retrieves an ninja
    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
        if(optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
    }
}