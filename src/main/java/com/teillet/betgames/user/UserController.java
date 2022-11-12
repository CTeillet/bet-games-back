package com.teillet.betgames.user;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public String createUser(@RequestParam String username, @RequestParam String password, @RequestParam String email,
                             @RequestParam String firstName, @RequestParam String lastName) {
        User user = new User(username, password, email, firstName, lastName);
        userRepository.save(user);
        return "user";
    }

    @PutMapping
    public String updateUser() {
        return "user";
    }


    @DeleteMapping
    public String deleteUser() {
        return "user";
    }
}
