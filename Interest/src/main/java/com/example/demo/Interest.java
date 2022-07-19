package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="interest_info")
public class Interest {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private int id;
private int interest_per;
private int interest_acno;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getInterest_per() {
	return interest_per;
}
public void setInterest_per(int interest_per) {
	this.interest_per = interest_per;
}
public int getInterest_acno() {
	return interest_acno;
}
public void setInterest_acno(int interest_acno) {
	this.interest_acno = interest_acno;
}

}
