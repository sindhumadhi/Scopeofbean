package com.transact.transcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.transact.Transact;
import com.transact.receiverRepo.SenderRepo;
import com.transact.senderRepo.ReceiverRepo;

import jakarta.transaction.Transactional;

@RestController
public class TransController 
{
	@Autowired
	SenderRepo sr;
	
	@Autowired
	ReceiverRepo rr;
	
	@Transactional
	@PostMapping("/postdata")
	public String post(@RequestBody Transact t)
	{
		sr.save(t.getSender());
		int a=10/0;
		rr.save(t.getReceiver());
		return "posted";
	}

}
