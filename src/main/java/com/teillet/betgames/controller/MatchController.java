package com.teillet.betgames.controller;

import com.teillet.betgames.model.Match;
import com.teillet.betgames.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MatchController {

    private final MatchRepository matchRepository;

    public MatchController(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @GetMapping("/matches")
    public List<Match> getMatches() {
        return matchRepository.findAll();
    }

    @GetMapping("/matches/{matchId}")
    public Match getMatch(@PathVariable Long matchId) {
        return matchRepository.findById(matchId).orElse(null);
    }

}
