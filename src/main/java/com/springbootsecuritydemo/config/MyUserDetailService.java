package com.springbootsecuritydemo.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.springbootsecuritydemo.bean.MyUserDetails;
import com.springbootsecuritydemo.bean.User;
import com.springbootsecuritydemo.bean.UserRole;
import com.springbootsecuritydemo.repository.UserRepository;
import com.springbootsecuritydemo.repository.UserRoleRepository;
import com.springbootsecuritydemo.service.UserRoleService;
import com.springbootsecuritydemo.service.UserService;

@Component
public class MyUserDetailService implements UserDetailsService {
	@Autowired
	private UserService userService;
	@Autowired
	private UserRoleService userroleService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
		MyUserDetails userDetails = new MyUserDetails();
		
		// 根据用户名查询用户基本信息
		User user = userService.findByUsername(username);
		if (null == user) {
			throw new UsernameNotFoundException("User not Found");
		}
		else {
			userDetails.setEnabled(user.isEnabled());
			userDetails.setId(user.getId());
			userDetails.setPassword(user.getPassword());
			userDetails.setUsername(user.getUsername());
		}

		// 根据用户名查询用户权限信息
		List<UserRole> userroleList = userroleService.findByUsername(username);
		if ((null == userroleList) || (0 == userroleList.size())) {
			throw new UsernameNotFoundException("User has no GrantAuthority");
		}
		List<GrantedAuthority> listAuth = new ArrayList<>();
		for (UserRole userrole : userroleList) {
			GrantedAuthority authority = new SimpleGrantedAuthority(userrole.getRolename());
			listAuth.add(authority);
		}
		userDetails.setAuthorities(listAuth);
		return userDetails;
	}
}
