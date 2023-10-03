package com.sendingMails;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class DemoMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Create object to "Properties" class and set "mailing server" details
				Properties props=new Properties();
				props.put("mail.smtp.host","smtp.gmail.com");
				props.put("mail.smtp.socketFactory.port","465");
				props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
				props.put("mail.smtp.auth","true");
				props.put("mail.smtp.port","465");
				
				// This will handle the complete authentication(credentials)
				Authenticator auth=new Authenticator()
				{
					protected PasswordAuthentication getPasswordAuthentication() 
					{
						return new PasswordAuthentication("vamankrishna123","bjdb teeu fpkm jczk");
					}
				};
			
				

	}

}
