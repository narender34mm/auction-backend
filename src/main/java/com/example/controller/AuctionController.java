package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Auction;
import com.example.service.AuctionService;


@RequestMapping("/admin")
@CrossOrigin("*")
@RestController
public class AuctionController {
	
	@Autowired
	private AuctionService auctionService;

	
	@PostMapping("/save")
	public Auction createAuction(@RequestBody Auction customer) {
		Auction createdCustomer = auctionService.createCustomer(customer);
		return createdCustomer;
	}
	
	@GetMapping("/all")
	public List<Auction> getAllAuction() {
		return auctionService.getAll();
		
	}
	
	@GetMapping("/{id}")
	public Auction getAuction( @PathVariable("id") int id) {
		return auctionService.getItem(id);
		
	}
	
	
	

}
