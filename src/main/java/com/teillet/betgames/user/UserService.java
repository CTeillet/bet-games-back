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
public class UserService {

	final AuthenticationManager authManager;
	final JwtTokenUtils jwtUtil;

	public UserService(AuthenticationManager authManager, JwtTokenUtils jwtUtil) {
		this.authManager = authManager;
		this.jwtUtil = jwtUtil;
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
}
