package com.example.EmploymentApp.Registration;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepo extends JpaRepository<Registration, Integer>{
	
	@Query("Select e from Registration e where personusername=?1 and personpassword=?2")
	List<Registration> userandpass(String user,String pass);

}
