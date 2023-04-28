package com.example.service;

import java.util.List;

import com.example.entity.Auction;

public interface AuctionService {

	Auction createCustomer(Auction customer);
	
	List<Auction> getAll();
	
	Auction getItem(int id);
	
}
