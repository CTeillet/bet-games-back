package com.teillet.betgames.repository;

import com.teillet.betgames.model.Bettor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BettorRepository extends JpaRepository<Bettor, Long> {

}

