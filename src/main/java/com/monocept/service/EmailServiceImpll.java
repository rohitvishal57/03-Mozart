package com.monocept.service;

import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpll implements EmailService{

	@Override
	public void sendEmail() {
	
		System.out.println("checking for graph after commiting once again");
		System.out.println("changes made in souvik branch");
	}

	
}
