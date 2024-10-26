package com.transact;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sender")
public class Sender {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String name;
	private int sentAmount;
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
	public int getSentAmount() {
		return sentAmount;
	}
	public void setSentAmount(int sentAmount) {
		this.sentAmount = sentAmount;
	}
	public int getTotAmount() {
		return totAmount;
	}
	public void setTotAmount(int totAmount) {
		this.totAmount = totAmount;
	}
	
	
	
	

}
