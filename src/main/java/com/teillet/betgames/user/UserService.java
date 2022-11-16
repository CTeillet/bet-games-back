package com.teillet.betgames.user;

import com.teillet.betgames.authentication.AuthRequest;
import com.teillet.betgames.authentication.AuthResponse;
import com.teillet.betgames.utils.JwtTokenUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

	final AuthenticationManager authManager;

	final JwtTokenUtils jwtUtil;

	final UserRepository userRepository;

	public UserService(AuthenticationManager authManager, JwtTokenUtils jwtUtil, UserRepository userRepository) {
		this.authManager = authManager;
		this.jwtUtil = jwtUtil;
		this.userRepository = userRepository;
	}

	public ResponseEntity<?> login(AuthRequest authRequest) {
		try {
			Authentication authentication = authManager.authenticate(
					new UsernamePasswordAuthenticationToken(
							authRequest.getUsername(),
							authRequest.getPassword()
					)
			);

			User user = (User) authentication.getPrincipal();
			String accessToken = jwtUtil.generateAccessToken(user);
			AuthResponse response = new AuthResponse(user.getEmail(), accessToken);

			return ResponseEntity.ok().body(response);
		} catch (BadCredentialsException ex) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
	}


	@Override
	public void delete(String username) {
		userRepository.deleteByUsername(username);
	}

	@Override
	public User get(String username) {
		return userRepository.findByUsername(username).orElseThrow();
	}

	@Override
	public void modify(User user) {
		userRepository.findByUsername(user.getUsername()).ifPresent(u -> {
			u.setEmail(user.getEmail());
			u.setPassword(user.getPassword());
			u.setFirstName(user.getFirstName());
			u.setLastName(user.getLastName());
			userRepository.save(u);
		});
	}

	@Override
	public void register(User user) {
		userRepository.save(user);
	}
}
