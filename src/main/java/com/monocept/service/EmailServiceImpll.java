package com.monocept.service;

import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpll implements EmailService{

	@Override
	public void sendEmail() {
		System.out.println("Email sent successfully.......");
		System.out.println("changes made inside local repository....");
		System.out.println("changes made in souvik branch");
	}

	
}
