package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.bookingdto.BookingDto;

@Service
public interface Services {

	void save(BookingDto bookingdto);

	void update(BookingDto bookingdto);

	BookingDto getuser(String mailId);
	
	
}
