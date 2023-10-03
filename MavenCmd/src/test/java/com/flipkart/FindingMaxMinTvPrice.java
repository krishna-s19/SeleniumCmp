package com.flipkart;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindingMaxMinTvPrice {
	
	public RemoteWebDriver d;
	public Date dt;
	public SimpleDateFormat sdf;
	public ATUTestRecorder recorder;
	public String vp;
	public List<String> name;
	public List<Integer> price;
	public File zipfile;
	
	
	@Test(priority = 1)
	public void startRecording() throws ATUTestRecorderException {
	
		sdf =new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
		dt = new Date();
		vp = "target\\"+sdf.format(dt);
		recorder =new ATUTestRecorder(vp,true);
		recorder.start();
	}
	@Test(priority = 2)
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		try 
		{
			d.findElement(By.xpath("//span[text()='Login']/preceding::span[@role='button']")).click();
			Thread.sleep(1000);
		}
		catch(Exception ons) 
		{ 
			System.out.println("No Banner for This time");
		}
	}
	
	@Test(priority = 3)
	public void findingMaxMinValues() {
	WebElement el=	d.findElement(By.xpath("//input[contains(@title,'Search for Products')]"));
		el.sendKeys("tv smart tv qled");
		el.sendKeys(Keys.ENTER);
		name = new ArrayList<String>();
		price = new ArrayList<Integer>();
		int total =0;
		while(true) {
			List<WebElement> eles = d.findElements(By.xpath("//div[contains(@class,'_1AtVbE col-12-12')]//following::div[contains(@data-id,'TVS')]"));
			total = total+eles.size();
			
			for(WebElement ele:eles) {
				String pr = ele.findElement(By.xpath("//div[contains(text(),'Free delivery')]//preceding::div[contains(@class,'_30jeq3 _1_WHN1')]")).getText();
			
				if(!pr.contains("Not Available")) {
					String names=ele.findElement(By.xpath("child::div[contains(@class,'_4rR01T')]")).getText(); 
					name.add(names);
					
					pr = pr.substring(1);
					pr = pr.replace(",", "");
					int p = Integer.parseInt(pr);
					price.add(p);
					
				}
			}
			try {
				Thread.sleep(2000);
				d.findElement(By.xpath("//span[text()='Next']/parent::a")).click();
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("No page is available");
				break;
			}//c
		}//while
	}//method
	
	@Test(priority=4)
	public void method4() throws Exception
	{
		//Find highest price and corresponding model name
		String maxmodel=name.get(0);
		int maxprice=price.get(0);
		for(int i=1;i<price.size();i++) //compare from 2nd item to last item
		{
			if(price.get(i)>maxprice)
			{
				maxprice=price.get(i);
				maxmodel=name.get(i);
			}
		}
			System.out.println("Maximum price "+maxprice+" model is "+maxmodel);
		//Find lowest price and corresponding model name
		String minmodel=name.get(0);
		int minprice=price.get(0);
		for(int i=1;i<price.size();i++) //compare from 2nd item to last item
		{
			if(price.get(i)<minprice)
			{
				minprice=price.get(i);
				minmodel=name.get(i);
			}
		}
		System.out.println("Minimum price "+minprice+" model is "+minmodel);
	}
	

	@Test(priority = 5)
	public void closeBrowser() {
		d.close();
	}
	@Test(priority = 6)
	public void stopRecording() throws ATUTestRecorderException {
		recorder.stop();
	}
	@Test(priority=7)
	public void method7() throws Exception
	{
		//convert video file into zip file(time taking)
		File fileToZip=new File(vp+".mov");
        FileInputStream fis=new FileInputStream(fileToZip);
		zipfile=new File(vp+".zip");
		FileOutputStream fos=new FileOutputStream(zipfile);
        ZipOutputStream zipOut=new ZipOutputStream(fos);
        ZipEntry zipEntry=new ZipEntry(fileToZip.getName());
        zipOut.putNextEntry(zipEntry);
        byte[] bytes=new byte[1024];
        int length;
        while((length=fis.read(bytes))>=0) 
        {
            zipOut.write(bytes, 0, length);
        }
        zipOut.close();
        fis.close();
        fos.close();
        Reporter.log("Zip completed.");
	}
	@Test(priority=8)
	public void method8() throws Exception
	{
		//forward that zip file to management via email
		//Create object to Properties class and set "host" values
		Properties props=new Properties();
		props.put("mail.smtp.host","smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port","465");
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth","true");
		props.put("mail.smtp.port","465");
		// This will handle the complete authentication
		Authenticator auth=new Authenticator()
		{
			protected PasswordAuthentication getPasswordAuthentication() 
			{
				return new PasswordAuthentication("vamankrishna123","bjdb teeu fpkm jczk");
			}
		};
				//Create object of Session class by using properties and authentication info
		Session session=Session.getDefaultInstance(props,auth);
		//Create object of Message class and set details
		Message msg=new MimeMessage(session);
		msg.setFrom(new InternetAddress("vamankrishna123@gmail.com"));
		msg.setRecipients(Message.RecipientType.TO,
				          InternetAddress.parse("vamanrudra.24@gmail.com"));
		msg.setSubject("Testing Subject");
		// Create object to add multimedia type content
		BodyPart bodymsg1=new MimeBodyPart();
		bodymsg1.setText("This is message body");
		BodyPart bodymsg2=new MimeBodyPart();
		String filename=zipfile.getAbsolutePath();
		DataSource source=new FileDataSource(filename);
		bodymsg2.setDataHandler(new DataHandler(source));
		bodymsg2.setFileName(filename);
		// Create object of MimeMultipart class
		Multipart mpart=new MimeMultipart();
		mpart.addBodyPart(bodymsg1);
		mpart.addBodyPart(bodymsg2);
		msg.setContent(mpart);
		// Finally send the email
		Transport.send(msg);
		Reporter.log("=====Email Sent=====");
	}
}