package com.example.EmploymentApp.Department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/depart")
public class DepartmentController {
	
	@Autowired
	private DepartmentRepo drepo;

	@PostMapping("/add")
	public Department addthedepart(@RequestBody Department dept ) {
		return drepo.save(dept);
	}
	
	@PostMapping("/addAll")
	public List<Department> addallthedepart(@RequestBody List<Department> deptall ) {
		return drepo.saveAll(deptall);
	}
	
	@GetMapping("/getAll")
	public  List<Department> getallthedepart(){
		return drepo.findAll();
	}
	
	@GetMapping("/get")
	public  Department getbyidthedepart(@PathVariable int id){
		return drepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Department not found with ID: " + id));
	}
}
