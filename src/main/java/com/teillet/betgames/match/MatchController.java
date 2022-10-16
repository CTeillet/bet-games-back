package com.teillet.betgames.match;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
