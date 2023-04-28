package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Auction;
import com.example.repository.AuctionRepository;

@Service
public class AuctionServiceImpl implements AuctionService {
	
	@Autowired
    private AuctionRepository auctionRepository;
	
	 @Override
	    public Auction createCustomer(Auction customer) {
			
	        return auctionRepository.save(customer);
	    }

	@Override
	public List<Auction> getAll() {
		
		return auctionRepository.findAll();
	}

	@Override
	public Auction getItem(int id) {
		return auctionRepository.findById(id).get();
	}

}
