package com.teillet.betgames.bet;

import com.teillet.betgames.match.Match;
import com.teillet.betgames.match.MatchRepository;
import com.teillet.betgames.match.StatusMatchEnum;
import com.teillet.betgames.user.User;
import com.teillet.betgames.user.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BetService {

	private final BetRepository betRepository;

	private final UserRepository userRepository;

	private final MatchRepository matchRepository;

	public BetService(
			BetRepository betRepository,
			UserRepository userRepository,
			MatchRepository matchRepository
	) {
		this.betRepository = betRepository;
		this.userRepository = userRepository;
		this.matchRepository = matchRepository;
	}

	public boolean addBet(
			Long idMatch,
			Long idBettor,
			String winnerTeam,
			float odds,
			float amount
	) {
		Match match = matchRepository.findById(idMatch).get();
		User user = userRepository.findById(idBettor).get();
		if (
				match.getStatus().equals(StatusMatchEnum.NOT_STARTED) &&
						user.getBalance() >= amount
		) {
			Bet bet = new Bet(
					winnerTeam,
					odds,
					amount,
					ResultBetEnum.NOT_FINISHED,
					LocalDateTime.now(),
					match,
					user
			);
			betRepository.save(bet);
			user.setBalance(user.getBalance() - amount);
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
			user.setBalance(user.getBalance() + bet.getAmount());
			userRepository.save(user);
			return true;
		}
		return false;
	}
}
