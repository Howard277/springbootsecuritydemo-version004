package com.springbootsecuritydemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.springbootsecuritydemo.bean.User;
import com.springbootsecuritydemo.config.MySecurityUtils;
import com.springbootsecuritydemo.repository.UserRepository;

@Transactional
@Component("userService")
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User findById(Long id) {
		return userRepository.findOne(id);
	}
	
	@PreAuthorize(MySecurityUtils.hasAuthorityADMIN)
	public void save(User user)
	{
		userRepository.save(user);
	}

	public void saveUser(List<User> list) {
		for (int i = 0; i < list.size(); i++) {
			userRepository.save(list.get(i));
		}
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findByUsername(String username)
	{
		return userRepository.findByUsername(username);
	}
}
