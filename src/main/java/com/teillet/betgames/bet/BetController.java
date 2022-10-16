package com.teillet.betgames.bet;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
public class BetController {
    private final BetService betService;

    public BetController(BetService betService) {
        this.betService = betService;
    }

    @GetMapping("/bets")
    public String getBets() {
        return "bets";
    }

    @PostMapping("/bets")
    public ResponseEntity<String> postBets(@RequestParam Long matchId, @RequestParam Long userId, @RequestParam String winnerTeam,
                                           @RequestParam float odds, @RequestParam float amount) {
        if (betService.addBet(matchId, userId, winnerTeam, odds, amount)) {
            return ResponseEntity.ok("Bet added");
        }
        return ResponseEntity.badRequest().body("Bet not added");
    }

    @DeleteMapping("/bets")
    public ResponseEntity<String> deleteBets(@RequestParam Long idBet) {
        if (betService.deleteBet(idBet)) {
            return ResponseEntity.ok("Bet deleted");
        }
        return ResponseEntity.badRequest().body("Bet not deleted");
    }

}
