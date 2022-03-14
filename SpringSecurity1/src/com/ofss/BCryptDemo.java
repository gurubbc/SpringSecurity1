package com.ofss;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptDemo {

	public static void main(String[] args) {
		String rawPassword="234";
		BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
		String hashedPassword=passwordEncoder.encode(rawPassword);
		System.out.println(hashedPassword+"!");

	}

}
