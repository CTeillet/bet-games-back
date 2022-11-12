package com.teillet.betgames.authentication;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter @Setter
public class AuthRequest {
    @NotNull
    private String username;

    @NotNull
    private String password;
}
