package in.livecoding.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.livecoding.entity.Role;
import in.livecoding.entity.User;
import in.livecoding.entity.UserRole;

@RestController
@RequestMapping("quiz")
public class QuizController {
	@RequestMapping("test")
	public String getTest() 
		{return "Hi Quiz";}

	
	
	
	
	
}
