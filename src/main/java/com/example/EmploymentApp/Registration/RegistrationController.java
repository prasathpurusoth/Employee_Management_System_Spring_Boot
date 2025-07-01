package com.example.EmploymentApp.Registration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class RegistrationController {
	
	@Autowired
	private RegistrationRepo rrepo;
	
	@PostMapping("/add")
	public Registration addThePerson(
	        @RequestParam String personname,
	        @RequestParam String persondob,
	        @RequestParam String personmailid,
	        @RequestParam String persongender,
	        @RequestParam String personusername,
	        @RequestParam String personpassword) {

	    Registration person = new Registration();
	    person.setPersonname(personname);
	    person.setPersondob(persondob);
	    person.setPersonmailid(personmailid);
	    person.setPersongender(persongender);
	    person.setPersonusername(personusername);
	    person.setPersonpassword(personpassword);

	    return rrepo.save(person);
	}
	
	@GetMapping("/userandpass")
    public String login(
            @RequestParam String personusername,
            @RequestParam String personpassword) {

        List<Registration> users = rrepo.userandpass(personusername, personpassword);
        if (users.isEmpty()) {
            return "Login failed: Invalid credentials, Please Signup to access";
        } else {
            return "Login successful: Welcome " + users.get(0).getPersonname();
        }
    }
	
	
	@PostMapping("/addall")
	public List<Registration> addAllPerson(@RequestBody List<Registration> allPerson){
		return rrepo.saveAll(allPerson);
	}
	
	@GetMapping("/getall")
	public List<Registration> getAllPerson(){
		return rrepo.findAll();
	}

}
