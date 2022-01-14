package com.example.demo.example;

import java.util.List;

public interface UserService {

	UserModel save(UserModel userModel);

	List<UserModel> findAll();

	UserModel findById(Integer userId);

	void delete(Integer userId);

}
