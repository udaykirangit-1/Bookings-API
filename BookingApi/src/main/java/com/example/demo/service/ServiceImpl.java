package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.booking.Booking;
import com.example.demo.bookingdto.BookingDto;
import com.example.demo.repository.Repositorys;

@Service
public class ServiceImpl implements Services {

	@Autowired
	Repositorys repository;
	
	@Override
	public void save(BookingDto bookingdto) {
		
		Booking booking = new Booking();
		BeanUtils.copyProperties(bookingdto, booking);
		repository.save(booking);
		
		
	}

	@Override
	public void update(BookingDto bookingdto) {
		Booking booking = new Booking();
		BeanUtils.copyProperties(bookingdto, booking);
		repository.save(booking);
		
	}

	@Override
	public BookingDto getuser(String mailId) {
		Booking findByMailId = repository.findByMailId(mailId);
		BookingDto bookingdto = new BookingDto(mailId, mailId, mailId, mailId, mailId);
		BeanUtils.copyProperties(findByMailId, bookingdto);
		System.out.println("done---");
		return bookingdto;
	}

}
