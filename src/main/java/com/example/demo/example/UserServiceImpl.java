package com.example.demo.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserModel save(UserModel userModel) {
		// TODO Auto-generated method stub
		return userRepository.save(userModel);
	}

	@Override
	public List<UserModel> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public UserModel findById(Integer userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).get();
	}

	@Override
	public void delete(Integer userId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(userId);
	}

}
