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
 * 用户角色关联
 * 
 * @author wuketao
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "userrole")
public class UserRole {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String rolename;

	private String username;
}
