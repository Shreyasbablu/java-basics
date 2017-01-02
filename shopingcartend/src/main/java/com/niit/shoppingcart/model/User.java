package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class User {
	
	private String name;
	private String password;
	private String mail;
	private String contact;
	private String role;
	
	

}
