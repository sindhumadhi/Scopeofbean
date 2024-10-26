package com.email.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;



@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender ms;
	
	public void mail(String to, String subject,String text)
	{
		SimpleMailMessage smm=new SimpleMailMessage();
		smm.setTo(to);
		smm.setSubject(subject);
		smm.setText(text);
		ms.send(smm);
		
	}
	
	
}
