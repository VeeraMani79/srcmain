package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "covenience_fees")
public class Fare {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private int covenience_GST;
	private int otpno;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCovenience_GST() {
		return covenience_GST;
	}

	public void setCovenience_GST(int covenience_GST) {
		this.covenience_GST = covenience_GST;
	}

	public int getOtpno() {
		return otpno;
	}

	public void setOtpno(int otpno) {
		this.otpno = otpno;
	}
}
