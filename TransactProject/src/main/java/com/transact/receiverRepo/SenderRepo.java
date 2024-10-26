package com.transact.receiverRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transact.Sender;

public interface SenderRepo extends JpaRepository<Sender, Integer>
{

	
}
