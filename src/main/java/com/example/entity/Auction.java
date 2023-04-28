package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "items")
@Data
public class Auction {
	
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;

	    @Column(name = "name")
	    private String name;

	    @Column(name = "description")
	    private String description;

	   
	    @Column(name="price")
	    private int price;

}
