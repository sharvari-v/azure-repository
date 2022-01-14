package com.example.demo.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@Transactional
@RestController
@RequestMapping(path = "/userModel")
public class UserController {

	@Autowired
	UserService userModelService;

//	SAVE API
	@PostMapping("/save")
	private UserModel save(@RequestBody UserModel userModel) {
		return userModelService.save(userModel);
	}

//	FIND ALL
	@GetMapping("/findAll")
	private List<UserModel> findAll() {
		return userModelService.findAll();
	}

//	FIND BY ID
	@GetMapping("/find/{userId}")
	private UserModel findById(@PathVariable("userId") Integer userId) {
		return userModelService.findById(userId);
	}

//	DELETE BY ID
	@DeleteMapping("/delete/{userId}")
	private void deleteById(@PathVariable("userId") Integer userId) {
		userModelService.delete(userId);
	}

}
