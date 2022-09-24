package com.teillet.betgames.controller;

import com.teillet.betgames.model.Bettor;
import com.teillet.betgames.repository.BettorRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class BettorController {
    private final BettorRepository bettorRepository;

    public BettorController(BettorRepository bettorRepository) {
        this.bettorRepository = bettorRepository;
    }

    @PostMapping("/bettor")
    public String createBettor(@RequestParam String username, @RequestParam String password, @RequestParam String email, @RequestParam String firstName, @RequestParam String lastName) {
        Bettor bettor = new Bettor(username, password, email, firstName, lastName);
        bettorRepository.save(bettor);
        return "user";
    }

    @PutMapping("/bettor")
    public String updateUser() {
        return "user";
    }


    @DeleteMapping("/bettor")
    public String deleteUser() {
        return "user";
    }
}
