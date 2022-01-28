package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dataModel.Seeker;
import service.SeekerService;


@RestController
public class Controller {
	
	
	public Controller() {
		System.out.println("hi");
	}
	@Autowired
	SeekerService seekerservice;

	
//	@RequestMapping("/signup")
//	public String signup() {
//		return "signup.jsp";
//	}
	
	@PostMapping("/registration")
	public Seeker registerUser(@RequestBody Seeker seeker){
		
		return seekerservice.registerSeeker(seeker);
		
		
	}
	@RequestMapping("hi")
	@ResponseBody
	public String hi() {
		return "hi";
	}
	
}
