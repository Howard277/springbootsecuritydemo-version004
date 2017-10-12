package com.springbootsecuritydemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.springbootsecuritydemo.bean.UserRole;
import com.springbootsecuritydemo.repository.UserRoleRepository;

/**
 * 用户角色服务层
 * 
 * @author wuketao
 *
 */
@Transactional
@Service
public class UserRoleService {
	@Autowired
	private UserRoleRepository userRoleRepository;

	/**
	 * 获取所有用户关系对象
	 * @return
	 */
	public List<UserRole> findAll() {
		return userRoleRepository.findAll();
	}
	
	public List<UserRole> findByUsername(String username)
	{
		return userRoleRepository.findByUsername(username);
	}
}
