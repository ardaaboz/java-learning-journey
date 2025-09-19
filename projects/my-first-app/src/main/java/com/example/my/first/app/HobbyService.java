package com.example.my.first.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class HobbyService {

    @Autowired
    private HobbyRepository hobbyRepository;

    public List<Hobby> getAllHobbies (){
        return hobbyRepository.findAll();
    }

    public Hobby createHobby(String name, String difficulty) {
        if (nameExists(name)) {
            throw new IllegalArgumentException("That name already exists!");
        }
        if (!isValidDifficulty(difficulty)) {
            throw new IllegalArgumentException("Difficulty must be Easy, Medium or Hard");
        }

        Hobby hobby = new Hobby(name, difficulty);
        return hobbyRepository.save(hobby);
    }

    private boolean isValidDifficulty(String difficulty) {
        return difficulty.equalsIgnoreCase("Easy") ||
                difficulty.equalsIgnoreCase("Medium") ||
                difficulty.equalsIgnoreCase("Hard");
    }

    public Optional<Hobby> findHobby (long id) {
        idExists(id);
        return hobbyRepository.findById(id);
    }

    public void deleteHobby (long id) {
        idExists(id);
        hobbyRepository.deleteById(id);
    }

    private boolean idExists (long id) {
        if (!hobbyRepository.existsById(id)) {
            throw new IllegalArgumentException("ID does not exist");
        }
        return true;
    }

    private boolean nameExists (String name) {
        if (!hobbyRepository.findByName(name).isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
