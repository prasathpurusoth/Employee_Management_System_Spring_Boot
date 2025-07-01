package com.example.EmploymentApp.Registration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="registrationtable")
public class Registration {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int personid;
	private String personname;
	private String persondob;
	private String personmailid;
	private String persongender;
	private String personusername;
	private String personpassword;
	public int getPersonid() {
		return personid;
	}
	public void setPersonid(int personid) {
		this.personid = personid;
	}
	public String getPersonname() {
		return personname;
	}
	public void setPersonname(String personname) {
		this.personname = personname;
	}
	public String getPersondob() {
		return persondob;
	}
	public void setPersondob(String persondob) {
		this.persondob = persondob;
	}
	public String getPersonmailid() {
		return personmailid;
	}
	public void setPersonmailid(String personmailid) {
		this.personmailid = personmailid;
	}
	public String getPersongender() {
		return persongender;
	}
	public void setPersongender(String persongender) {
		this.persongender = persongender;
	}
	public String getPersonusername() {
		return personusername;
	}
	public void setPersonusername(String personusername) {
		this.personusername = personusername;
	}
	public String getPersonpassword() {
		return personpassword;
	}
	public void setPersonpassword(String personpassword) {
		this.personpassword = personpassword;
	}
	
	
}
