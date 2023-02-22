package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.booking.Booking;

@Repository
public interface Repositorys extends JpaRepository<Booking, String> {

	Booking findByMailId(String mailId);
	
}
