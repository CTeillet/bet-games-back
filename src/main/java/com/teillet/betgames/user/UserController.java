package com.teillet.betgames.user;

import com.teillet.betgames.api.UserApi;
import com.teillet.betgames.dto.UserDto;
import org.springframework.http.ResponseEntity;


public class UserController implements UserApi {
	private final UserService userService;

	private final UserUtils userUtils;

	public UserController(UserService userService, UserUtils userUtils) {
		this.userService = userService;
		this.userUtils = userUtils;
	}

	@Override
	public ResponseEntity<Void> deleteUser(String usernameDeleteUser) {
		userService.delete(usernameDeleteUser);
		return null;
	}

	@Override
	public ResponseEntity<UserDto> getUser(String username) {
		return ResponseEntity.ok(userUtils.convertToDto(userService.get(username)));
	}

	@Override
	public ResponseEntity<Void> modifyUser(UserDto userDto) {
		userService.modify(userUtils.convertToEntity(userDto));
		return ResponseEntity.ok().build();
	}

	@Override
	public ResponseEntity<Void> registerUser(UserDto userDto) {
		userService.register(userUtils.convertToEntity(userDto));
		return ResponseEntity.ok().build();
	}
}
