package com.smart.scm.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.smart.scm.dao.UserRepository;
import com.smart.scm.entites.Contact;
import com.smart.scm.entites.User;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	//method for adding the common Data
	@ModelAttribute
	public void addCommonData(Model m, Principal p) {
		String username = p.getName();
		System.out.println("welcome "+username);
		User user = this.userRepository.getUserByUser(username);
		System.out.println("welcome "+user);
		
		m.addAttribute("user",user);
	}
	
	
	// home Dashboard
	@RequestMapping("/index")
	public String dashboard(Model model,Principal principal) {
		
		
		return "normal/user_dashboard";
	}
	
	//open add form handler
	@GetMapping("/add-contact")
	public String openAddContactForm(Model model) {
		model.addAttribute("title","Add Contact");
		model.addAttribute("contact" , new Contact());
		
		return "normal/add_contact_form";
		
	}
	
	//processing add contact form
	@PostMapping("/user/process-contact")
	public String processContact() {
		
		return "normal/add_contact_form";
	}
	
	
}
