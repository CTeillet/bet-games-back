package com.teillet.betgames.user;

import com.teillet.betgames.dto.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserUtils {

	private final ModelMapper modelMapper;

	public UserUtils(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	//convert User to UserDto using the mapper
	public UserDto convertToDto(User user) {
		return modelMapper.map(user, UserDto.class);
	}

	//convert UserDto to User using the mapper
	public User convertToEntity(UserDto userDto) {
		return modelMapper.map(userDto, User.class);
	}

}
