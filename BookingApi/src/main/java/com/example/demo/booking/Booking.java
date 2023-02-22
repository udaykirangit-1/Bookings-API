package com.example.demo.booking;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Booking {
	
	@Id
	private String mailId;
	
	private String source;
	
	private String destination;
	
	private String noOfPassengers;
	
	private String date;

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(String noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Booking(String mailId, String source, String destination, String noOfPassengers, String date) {
		super();
		this.mailId = mailId;
		this.source = source;
		this.destination = destination;
		this.noOfPassengers = noOfPassengers;
		this.date = date;
	}
	
	public Booking() {
		
	}

}
