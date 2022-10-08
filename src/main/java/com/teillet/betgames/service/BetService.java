package com.teillet.betgames.service;

import com.teillet.betgames.enums.ResultBetEnum;
import com.teillet.betgames.enums.StatusMatchEnum;
import com.teillet.betgames.model.Bet;
import com.teillet.betgames.model.User;
import com.teillet.betgames.model.Match;
import com.teillet.betgames.repository.BetRepository;
import com.teillet.betgames.repository.UserRepository;
import com.teillet.betgames.repository.MatchRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BetService {

    private final BetRepository betRepository;

    private final UserRepository userRepository;

    private final MatchRepository matchRepository;

    public BetService(BetRepository betRepository, UserRepository userRepository, MatchRepository matchRepository) {
        this.betRepository = betRepository;
        this.userRepository = userRepository;
        this.matchRepository = matchRepository;
    }

    public boolean addBet(Long idMatch, Long idBettor, String winnerTeam, float rating, float amount) {
        Match match = matchRepository.findById(idMatch).get();
        User user = userRepository.findById(idBettor).get();
        if (match.getStatus().equals(StatusMatchEnum.NOT_STARTED) && user.getAmount() >= amount) {
            Bet bet = new Bet(winnerTeam, rating, amount, ResultBetEnum.NOT_FINISHED, LocalDateTime.now(), match, user);
            betRepository.save(bet);
            user.setAmount(user.getAmount() - amount);
            userRepository.save(user);
            return true;
        }
        return false;
    }

    public boolean deleteBet(Long idBet) {
        Bet bet = betRepository.findByBetId(idBet);
        Match match = bet.getMatch();
        User user = bet.getUser();
        if (bet.getResultBet().equals(ResultBetEnum.NOT_FINISHED)) {
            betRepository.delete(bet);
            user.setAmount(user.getAmount() + bet.getAmount());
            userRepository.save(user);
            return true;
        }
        return false;
    }
}
