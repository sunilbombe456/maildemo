package com.ovmsab.maildemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.ovmsab.maildemo.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	 private JavaMailSender javaMailSender;

	@Override
	public boolean sendEmail(String emailId, String fileName) {
		// TODO Auto-generated method stub
		  SimpleMailMessage mailMessage = new SimpleMailMessage();

	        mailMessage.setTo(emailId);
	        mailMessage.setSubject("testing java email Demo..!");
	        mailMessage.setText("done");

	        mailMessage.setFrom("javapractice2@gmail.com");

	        javaMailSender.send(mailMessage);
		return true;
	}
	


}
