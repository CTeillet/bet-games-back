package com.teillet.betgames.user;

import com.teillet.betgames.dto.UserDto;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import static org.assertj.core.api.Assertions.assertThat;

class UserUtilsTest {
	private final ModelMapper modelMapper = new ModelMapper();

	//Test the convertToDto method
	@Test
	public void whenConvertUserEntityToUserDto_thenCorrect() {
		User user = new User();
		user.setUsername("test");
		user.setPassword("pass");
		user.setBalance(100.0);

		UserDto userDto = modelMapper.map(user, UserDto.class);
		assertThat(userDto.getUsername()).isEqualTo(user.getUsername());
		assertThat(userDto.getPassword()).isEqualTo(user.getPassword());
		assertThat(userDto.getBalance()).isEqualTo(user.getBalance());
	}

	//Test the convertToEntity method
	@Test
	public void whenConvertUserDtoToUserEntity_thenCorrect() {
		UserDto userDto = new UserDto();
		userDto.setUsername("test");
		userDto.setPassword("pass");
		userDto.setBalance(100.0);

		User user = modelMapper.map(userDto, User.class);
		assertThat(user.getUsername()).isEqualTo(userDto.getUsername());
		assertThat(user.getPassword()).isEqualTo(userDto.getPassword());
		assertThat(user.getBalance()).isEqualTo(userDto.getBalance());
	}
}
