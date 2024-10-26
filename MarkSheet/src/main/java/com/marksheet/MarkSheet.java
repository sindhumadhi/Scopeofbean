package com.marksheet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="marktable")
public class MarkSheet 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int rollNo;
	private String name;
	private int sem1T;
	private int Sem1P;
	private int Sem2T;
	private int sem2P;
	private int sem1Tot;
	private int sem2Tot;
	
	
	public int getSem1Tot() {
		return sem1Tot;
	}
	public void setSem1Tot(int sem1Tot) {
		this.sem1Tot = sem1Tot;
	}
	public int getSem2Tot() {
		return sem2Tot;
	}
	public void setSem2Tot(int sem2Tot) {
		this.sem2Tot = sem2Tot;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSem1T() {
		return sem1T;
	}
	public void setSem1T(int sem1t) {
		sem1T = sem1t;
	}
	public int getSem1P() {
		return Sem1P;
	}
	public void setSem1P(int sem1p) {
		Sem1P = sem1p;
	}
	public int getSem2T() {
		return Sem2T;
	}
	public void setSem2T(int sem2t) {
		Sem2T = sem2t;
	}
	public int getSem2P() {
		return sem2P;
	}
	public void setSem2P(int sem2p) {
		sem2P = sem2p;
	}
	
	
	

}
