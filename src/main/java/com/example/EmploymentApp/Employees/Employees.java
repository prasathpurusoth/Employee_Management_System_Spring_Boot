package com.example.EmploymentApp.Employees;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employeedetials")
public class Employees {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emp_id;
	private String emp_mail;
	private String emp_shift;
	private String emp_department;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_mail() {
		return emp_mail;
	}
	public void setEmp_mail(String emp_mail) {
		this.emp_mail = emp_mail;
	}
	public String getEmp_shift() {
		return emp_shift;
	}
	public void setEmp_shift(String emp_shift) {
		this.emp_shift = emp_shift;
	}
	public String getEmp_department() {
		return emp_department;
	}
	public void setEmp_department(String emp_department) {
		this.emp_department = emp_department;
	}
	
}
