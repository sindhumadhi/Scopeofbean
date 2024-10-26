package com.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemailController {
	 @Autowired
	 Remailservice rs;
	
	 @GetMapping("/get")
	 public String receiveEmails()throws Exception
	 {
		 rs.receiveEmails();
		 return "Email Retrieved";
	 }

}
