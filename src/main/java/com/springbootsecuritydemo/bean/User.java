package com.springbootsecuritydemo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户
 * @author wuketao
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String password;

	private String username;
	
	/**
	 * 用户有效定义 false为不可用  true为可用
	 * 在mysql中使用tinyint定义该列，0表示false 1表示true。
	 * 当数据库中为0时，用户无法登录。
	 */
	private boolean enabled;
}