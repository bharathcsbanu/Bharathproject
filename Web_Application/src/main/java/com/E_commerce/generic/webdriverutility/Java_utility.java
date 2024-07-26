package com.E_commerce.generic.webdriverutility;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Java_utility {
  
	public int getRandamNumber() {
		Random ran=new Random();
	int randomNumber=	ran.nextInt(5000);
	
		return randomNumber;
	}
	public String getSystemDateYYYYDDMM() {
		Date date =new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM_dd");
	String Date=sdf.format(date);
	return Date ;		
	}
}
