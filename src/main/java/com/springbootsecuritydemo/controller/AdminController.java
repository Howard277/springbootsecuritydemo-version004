package com.springbootsecuritydemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springbootsecuritydemo.bean.User;
import com.springbootsecuritydemo.service.UserService;

/**
 * 管理员 控制器
 * @author wuketao
 *
 */
@Controller
@RequestMapping("admin")
public class AdminController {
	@Autowired
	private UserService userService;

	/**
	 * 索引页面
	 * @return
	 */
	@RequestMapping(value={"","index"})
	public String index()
	{
		return "admin/index";
	}
	
	/**
	 * 获取所有管理员信息
	 * @return
	 */
	@RequestMapping("findAll")
	@ResponseBody
	public List<User> findAll()
	{
		return userService.findAll();
	}
}
