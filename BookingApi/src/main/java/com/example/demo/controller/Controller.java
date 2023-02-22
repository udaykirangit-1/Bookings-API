package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bookingdto.BookingDto;
import com.example.demo.service.Services;

@RestController
public class Controller {
	
	@Autowired
	Services services;
	
	
	@PostMapping("/post-booking")
	public String createBooking(@RequestBody BookingDto bookingdto) {
		
		services.save(bookingdto);
		return"user saved";
	}
	
	@PutMapping("/put-booking")
	public String updateBooking(@RequestBody BookingDto bookingdto) {
		services.update(bookingdto);
		return"Booking Status Applied";
		
	}
	
	@GetMapping("/get-booking/{mailId}")
	public BookingDto getuser(@PathVariable String mailId) {
		System.out.println("user data "+mailId);
		return services.getuser(mailId);
		
		
	}

}
