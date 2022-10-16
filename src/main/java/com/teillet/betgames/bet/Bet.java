package com.teillet.betgames.bet;

import com.teillet.betgames.match.Match;
import com.teillet.betgames.user.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "bet")
public class Bet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "bet_id", updatable = false, nullable = false)
    private Long betId;

    @Column(nullable = false)
    private String winnerTeam;

    @Column(nullable = false)
    private float odds;

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
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Bet(String winnerTeam, float odds, float amount, ResultBetEnum resultBet, LocalDateTime date, Match match, User user) {
        this.winnerTeam = winnerTeam;
        this.odds = odds;
        this.amount = amount;
        this.resultBet = resultBet;
        this.date = date;
        this.match = match;
        this.user = user;
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
