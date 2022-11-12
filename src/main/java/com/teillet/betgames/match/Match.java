package com.teillet.betgames.match;

import com.teillet.betgames.bet.Bet;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "match")
public class Match {
    @Id
    @Column(name = "match_id", updatable = false, nullable = false)
    private Long matchId;

    @Column(nullable = false)
    private SportEnum sport;

    @Column(nullable = false)
    private String league;

    @Column(name = "team_a")
    private String teamA;

    @Column(name = "team_b")
    private String teamB;

    private Float cote;

    @Column(nullable = false)
    private StatusMatchEnum status;

    private String winnerTeam;

    private Date date;

    @OneToMany(mappedBy = "match", orphanRemoval = true)
    @ToString.Exclude
    private List<Bet> bets = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Match match = (Match) o;
        return matchId != null && Objects.equals(matchId, match.matchId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
