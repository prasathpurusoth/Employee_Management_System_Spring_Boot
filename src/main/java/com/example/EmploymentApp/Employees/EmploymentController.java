package com.example.EmploymentApp.Employees;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/emp")
public class EmploymentController {

	@Autowired
	private EmploymentRepo erepo;

	@PostMapping("/add")
	public String addtheemployee(@RequestParam String Mail, @RequestParam String Shift,
			@RequestParam String Department) {
		Employees emp = new Employees();
		emp.setEmp_mail(Mail);
		emp.setEmp_shift(Shift);
		emp.setEmp_department(Department);

		erepo.save(emp);
		return "Person " + Mail + " Successfully created";
	}

	@GetMapping("/getall")
	public List<Employees> getalldata() {
		return erepo.findAll();
	}


	@GetMapping("/get")
	public List<Employees> getbyname(@RequestParam String name){
		return erepo.findmail(name);
	}

}
