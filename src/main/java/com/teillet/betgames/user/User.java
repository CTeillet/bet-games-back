package com.teillet.betgames.user;

import com.teillet.betgames.bet.Bet;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "user")
public class User implements UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "user_id", updatable = false, nullable = false)
	private Long userId;

	@Column(nullable = false, unique = true)
	private String username;

	@Column(nullable = false)
	private String password;

	@Email
	private String email;

	private String firstName;

	private String lastName;

	@Column(nullable = false)
	@Min(0)
	private Double balance;

	@OneToMany(mappedBy = "user", orphanRemoval = true)
	@ToString.Exclude
	private List<Bet> bets = new ArrayList<>();

	public User(
			String username,
			String password,
			String email,
			String firstName,
			String lastName
	) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = 0.;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (
				o == null || Hibernate.getClass(this) != Hibernate.getClass(o)
		) return false;
		User user = (User) o;
		return userId != null && Objects.equals(userId, user.userId);
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
