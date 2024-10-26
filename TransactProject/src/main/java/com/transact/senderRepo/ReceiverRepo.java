package com.transact.senderRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transact.Receiver;

public interface ReceiverRepo extends JpaRepository<Receiver, Integer>
{

	
}
