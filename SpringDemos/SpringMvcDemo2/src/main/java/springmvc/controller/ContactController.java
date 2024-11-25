package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
//import springmvc.service.UserService;

@Controller
public class ContactController {
	
	//@Autowired
	//private UserService userService;

	@RequestMapping("/contacts")
	public String showForm() {
		System.out.println("From Contacts");
		return "contacts";
		
	}
	
	@ModelAttribute
	public void commonData(Model m)
	{
		m.addAttribute("head", "Welcome to Leaning Spring MVC");
		m.addAttribute("desc", "Start Learning Everyday");
		System.out.println("From the Common Data class");
	}

	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm( @ModelAttribute User u)
	{	
		//this.userService.createUser(u);
		return "success";
		
	}
}


//Using @RequestParam() -->>
/*
 * public String handleForm(
 * 
 * @RequestParam("UserEmail") String uemail,
 * 
 * @RequestParam("UserName") String uname,
 * 
 * @RequestParam("UserPassword") String upassword, Model mod) {
 * 
 * System.out.println("User Email is : "+uemail);
 * System.out.println("User name is : "+uname);
 * System.out.println("User password is : "+upassword);
 * 
 * User u=new User(); u.setUserEmail(uemail); u.setUserName(uname);
 * u.setUserPassword(upassword); System.out.println(u);
 * 
 * 
 * mod.addAttribute("email", uemail); mod.addAttribute("name",uname);
 * mod.addAttribute("password", upassword);
 * 
 * mod.addAttribute("user", u); return "success";
 * 
 * }
 */