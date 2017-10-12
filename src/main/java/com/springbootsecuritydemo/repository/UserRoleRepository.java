package com.springbootsecuritydemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springbootsecuritydemo.bean.UserRole;

/**
 * 用户角色关联repository
 * 
 * @author wuketao
 *
 */
@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
	@Query("select d from UserRole d where d.username = :username")
	public List<UserRole> findByUsername(@Param("username") String username);
}
