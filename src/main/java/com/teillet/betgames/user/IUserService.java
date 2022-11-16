package com.teillet.betgames.user;

public interface IUserService {

	void delete(String username);

	User get(String username);

	void modify(User user);

	void register(User user);

}
