package com.teillet.betgames.model;

import com.teillet.betgames.enums.ResultBetEnum;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Bet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "bet_id", updatable = false, nullable = false)
    private Long betId;

    @Column(nullable = false)
    private String winnerTeam;

    @Column(nullable = false)
    private float rating;

    @Column(nullable = false)
    private float amount;

    @Column(nullable = false)
    private ResultBetEnum resultBet;

    @Column(nullable = false)
    private LocalDateTime date;

    @ManyToOne(optional = false)
    @JoinColumn(name = "match_id", nullable = false)
    private Match match;

    @ManyToOne(optional = false)
    @JoinColumn(name = "bettor_id", nullable = false)
    private Bettor bettor;

    public Bet(String winnerTeam, float rating, float amount, ResultBetEnum resultBet, LocalDateTime date, Match match, Bettor bettor) {
        this.winnerTeam = winnerTeam;
        this.rating = rating;
        this.amount = amount;
        this.resultBet = resultBet;
        this.date = date;
        this.match = match;
        this.bettor = bettor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Bet bet = (Bet) o;
        return betId != null && Objects.equals(betId, bet.betId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}