package com.teillet.betgames.repository;

import com.teillet.betgames.model.Bet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BetRepository extends JpaRepository<Bet, Long> {

    Bet findByBetId(Long betId);

}
