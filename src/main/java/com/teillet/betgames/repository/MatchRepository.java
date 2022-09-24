package com.teillet.betgames.repository;

import com.teillet.betgames.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MatchRepository extends JpaRepository<Match, Long> {

    Match findByMatchId(Long matchId);




}

