package com.ovmsab.maildemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ovmsab.maildemo.service.EmailService;

@SpringBootApplication
public class MaildemoApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(MaildemoApplication.class, args);
		
	}

}
