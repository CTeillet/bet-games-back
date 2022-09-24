package com.teillet.betgames.service;

import com.teillet.betgames.enums.ResultBetEnum;
import com.teillet.betgames.enums.StatusMatchEnum;
import com.teillet.betgames.model.*;
import com.teillet.betgames.repository.BetRepository;
import com.teillet.betgames.repository.MatchRepository;
import com.teillet.betgames.repository.BettorRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BetService {

    private final BetRepository betRepository;

    private final BettorRepository bettorRepository;

    private final MatchRepository matchRepository;

    public BetService(BetRepository betRepository, BettorRepository bettorRepository, MatchRepository matchRepository) {
        this.betRepository = betRepository;
        this.bettorRepository = bettorRepository;
        this.matchRepository = matchRepository;
    }

    public boolean addBet(Long idMatch, Long idBettor, String winnerTeam, float rating, float amount) {
        Match match = matchRepository.findById(idMatch).get();
        Bettor bettor = bettorRepository.findById(idBettor).get();
        if (match.getStatus().equals(StatusMatchEnum.NOT_STARTED) && bettor.getAmount() >= amount) {
            Bet bet = new Bet(winnerTeam, rating, amount, ResultBetEnum.NOT_FINISHED, LocalDateTime.now(), match, bettor);
            betRepository.save(bet);
            bettor.setAmount(bettor.getAmount() - amount);
            bettorRepository.save(bettor);
            return true;
        }
        return false;
    }

    public boolean deleteBet(Long idBet) {
        Bet bet = betRepository.findByBetId(idBet);
        Match match = bet.getMatch();
        Bettor bettor = bet.getBettor();
        if (bet.getResultBet().equals(ResultBetEnum.NOT_FINISHED)) {
            betRepository.delete(bet);
            bettor.setAmount(bettor.getAmount() + bet.getAmount());
            bettorRepository.save(bettor);
            return true;
        }
        return false;
    }
}
