package com.ankit.jpastreamer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ankit.jpastreamer.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
