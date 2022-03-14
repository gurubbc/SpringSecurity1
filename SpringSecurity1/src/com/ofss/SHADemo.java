package com.ofss;

import java.math.BigInteger;
import java.security.MessageDigest;

public class SHADemo {

	public static String getSHA(String plainPassword) {
		// Static getInstace method is called with hasing SHA
		
		try {
		MessageDigest md=MessageDigest.getInstance("SHA-256");
		
		byte[] messageDigest=md.digest(plainPassword.getBytes());
		
		// convert message digest into hex value
		
		BigInteger no=new BigInteger(1, messageDigest);
		
		String hashText=no.toString(16); // hexa decimal value
		
		while (hashText.length()<32)
		{
			hashText="0"+hashText;
		}
		
		
		
		return hashText;
		}
		catch (Exception e) {
			System.out.println("Exception thrown "+e.getMessage());
			return null;
		}
		

	}
	
	public static void main(String[] args) {
		String pp="arun123";
		String ep=getSHA(pp);
		System.out.println("plain password is "+pp);
		System.out.println("encoded password is "+ep);
	}

}
