package com.springbootsecuritydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootsecuritydemo.bean.Role;

/**
 * 角色repository
 * 
 * @author wuketao
 *
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
