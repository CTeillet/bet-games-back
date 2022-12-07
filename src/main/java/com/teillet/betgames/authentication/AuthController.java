package com.teillet.betgames.authentication;

import com.teillet.betgames.api.LoginApi;
import com.teillet.betgames.dto.AuthRequestDto;
import com.teillet.betgames.dto.AuthResponseDto;
import com.teillet.betgames.dto.DeleteRequestDto;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AuthController implements LoginApi {

	private final @NonNull AuthService authService;

	@Override
	public ResponseEntity<AuthResponseDto> login(AuthRequestDto authRequestDto) {
		return null;
	}

	@Override
	public ResponseEntity<Void> logout(DeleteRequestDto deleteRequestDto) {
		return null;
	}
}
