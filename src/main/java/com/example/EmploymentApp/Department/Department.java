package com.example.EmploymentApp.Department;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departmentdetials")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dept_id;
	private String dept_name;
	private String dept_shift;
	private int salary;
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getDept_shift() {
		return dept_shift;
	}
	public void setDept_shift(String dept_shift) {
		this.dept_shift = dept_shift;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
