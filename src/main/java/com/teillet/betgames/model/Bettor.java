package com.teillet.betgames.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Bettor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "bettor_id", updatable = false, nullable = false)
    private Long bettorId;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    private String email;

    private String firstName;

    private String lastName;

    @Column(nullable = false)
    private Float amount;

    public Bettor(String username, String password, String email, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.amount = 0f;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Bettor bettor = (Bettor) o;
        return bettorId != null && Objects.equals(bettorId, bettor.bettorId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
