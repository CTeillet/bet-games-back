package com.teillet.betgames.controller;


import com.teillet.betgames.repository.ParameterRepository;
import com.teillet.betgames.service.MatchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final MatchService matchService;

    public TestController(MatchService matchService, ParameterRepository parameterRepository) {
        this.matchService = matchService;
    }

    @GetMapping("/test")
    public void test() {
        matchService.loadResult3Hours();
    }

}
