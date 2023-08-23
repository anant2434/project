package com.app.service;

import java.util.List;

import com.app.dto.UserResponseDto;
import com.app.entities.User;

public interface IUserService {
	List<User> getAllUsers();
	User addNewUser(User newUser);

}
