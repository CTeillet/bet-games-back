package com.teillet.betgames.config;

import com.teillet.betgames.authentication.JwtTokenFilter;
import com.teillet.betgames.user.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletResponse;

/**
 * Configures our application with Spring Security to restrict access to our API endpoints.
 */
@Configuration
public class SecurityConfig {

	private final UserRepository userRepository;

	private final JwtTokenFilter jwtTokenFilter;

	public SecurityConfig(
			UserRepository userRepository,
			JwtTokenFilter jwtTokenFilter
	) {
		this.userRepository = userRepository;
		this.jwtTokenFilter = jwtTokenFilter;
	}

	@Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http
				.sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS);

		http
				.authorizeRequests()
				.mvcMatchers("/")
				.permitAll()
				.mvcMatchers("/api/")
				.authenticated(); //Example for securing an endpoint
		//.mvcMatchers("/api/private-scoped").hasAuthority("SCOPE_read:messages") //Example for securing an endpoint with roles

		http
				.exceptionHandling()
				.authenticationEntryPoint((request, response, ex) ->
						response.sendError(HttpServletResponse.SC_UNAUTHORIZED, ex.getMessage())
				);

		http.addFilterBefore(
				jwtTokenFilter,
				UsernamePasswordAuthenticationFilter.class
		);

		return http.build();
	}

	@Bean
	public UserDetailsService userDetailsService() {
		return username ->
				userRepository
						.findByUsername(username)
						.orElseThrow(() ->
								new UsernameNotFoundException("User " + username + " not found")
						);
	}

	@Bean
	public AuthenticationManager authenticationManager(
			AuthenticationConfiguration authConfig
	) throws Exception {
		return authConfig.getAuthenticationManager();
	}
}
