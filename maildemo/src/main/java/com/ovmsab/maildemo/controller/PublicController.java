package com.ovmsab.maildemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ovmsab.maildemo.service.EmailService;

@Controller
@RequestMapping("/public/email")
public class PublicController {

	@Autowired
	private EmailService emailService; 
	
	@GetMapping("/sendEmail")
	public String sendEmail() {
		if(emailService.sendEmail("sunilbombe456@gmail.com", "abc.txt")) {
			return "Email Sent Successfull..!";
		}else {
			return "Email Not Sent Successfull..!";
		}
	}
	
}
