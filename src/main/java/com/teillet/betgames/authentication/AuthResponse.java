package com.teillet.betgames.authentication;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthResponse {
    private String username;
    private String accessToken;

    public AuthResponse(String username, String accessToken) {
        this.username = username;
        this.accessToken = accessToken;
    }
}
