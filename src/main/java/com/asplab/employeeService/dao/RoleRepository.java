package com.asplab.employeeService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asplab.employeeService.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
