package com.yueyuan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yueyuan.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee getByLastName(String lastName);
	
}
