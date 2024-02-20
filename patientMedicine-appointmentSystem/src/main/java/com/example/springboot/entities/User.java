package com.example.springboot.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "EntityUser")
	
	public class User {
		
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	    private Long id;
		
		
		@Column(nullable = false)
		private String username;
		
		@Column(nullable = false)
		private String password;
		
		private String roles = "";

		
		private boolean active;
		
		public List<String> getRoleList(){
	        if(this.roles.length() > 0){
	            return Arrays.asList(this.roles.split(","));
	        }
	        return new ArrayList<>();
	    }

		public String getPassword() {
			return password;
		}

		public String getUsername() {
			return username;
		}

		public boolean isActive() {
			return false;
		}
		

	}

