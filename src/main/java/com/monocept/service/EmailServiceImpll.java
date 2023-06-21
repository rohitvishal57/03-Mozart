package com.monocept.service;

import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpll implements EmailService{

	@Override
	public void sendEmail() {
		System.out.println("Email sent successfully.......");
		System.out.println("changes made inside local repository....");
<<<<<<< HEAD
		System.out.println("changes made in souvik branch");
=======
		System.out.println("checking for graph after commiting once again");
>>>>>>> cfce0ac36a47b74b767748da5c502ccd95644559
	}

	
}
