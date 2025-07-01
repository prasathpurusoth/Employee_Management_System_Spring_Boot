package com.example.EmploymentApp.Employees;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface EmploymentRepo extends JpaRepository<Employees, Integer> {
	
	@Query("SELECT e FROM Employees e WHERE e.emp_mail = ?1")
	List<Employees> findmail(String mail);
	
	}
