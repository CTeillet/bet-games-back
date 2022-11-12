package com.teillet.betgames;


import com.teillet.betgames.match.MatchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final MatchService matchService;

    public TestController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/test")
    public void test() {
        matchService.loadResult3Hours();
    }

}
