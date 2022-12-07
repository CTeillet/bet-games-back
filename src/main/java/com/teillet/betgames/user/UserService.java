package com.teillet.betgames.user;

import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

	final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
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
