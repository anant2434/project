package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.User;
import com.app.repository.UserEntityRepository;

@Service
@Transactional
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserEntityRepository userepo;

	@Override
	public List<User> getAllUsers() {
		return userepo.findAll();
	}

	@Override
	public User addNewUser(User newUser) {
		
		return userepo.save(newUser);
	}
	
	

}
