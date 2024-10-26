package com.transact;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="receiver")
public class Receiver 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String name;
	private int receiveAmount;
	private int totAmount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getReceiveAmount() {
		return receiveAmount;
	}
	public void setReceiveAmount(int receiveAmount) {
		this.receiveAmount = receiveAmount;
	}
	public int getTotAmount() {
		return totAmount;
	}
	public void setTotAmount(int totAmount) {
		this.totAmount = totAmount;
	}
	
	
	
	
}
