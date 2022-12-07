package com.teillet.betgames.authentication;

import com.teillet.betgames.user.User;
import com.teillet.betgames.utils.JwtTokenUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AuthService {
	private final AuthenticationManager authManager;

	private final JwtTokenUtils jwtUtil;

	public AuthResponse login(AuthRequest authRequest) throws BadCredentialsException {
		Authentication authentication = authManager.authenticate(
				new UsernamePasswordAuthenticationToken(
						authRequest.getUsername(),
						authRequest.getPassword()
				)
		);

		User user = (User) authentication.getPrincipal();
		String accessToken = jwtUtil.generateAccessToken(user);

		return new AuthResponse(user.getUsername(), accessToken);

	}
}
