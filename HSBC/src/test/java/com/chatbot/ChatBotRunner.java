package com.chatbot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class ChatBotRunner {

    @Test
    public void demo() throws Exception {
		
		/*
		String q = "How are you";

		RemoteWebDriver d = new ChromeDriver();
		
		 d.get("https://www.chatbot.com/");
		 d.manage().window().maximize();
		 Thread.sleep(5000);
		 d.switchTo().frame("chatbot-chat-frame"); 
		 Thread.sleep(5000);
		 d.findElement(By.className("lazy-img-loaded")).click(); 
		 Thread.sleep(5000);
		  d.findElement(By.xpath("//*[@placeholder='Type your message here']")).
		  sendKeys(q,Keys.ENTER); 
		  Thread.sleep(5000); 
		  String actualreslut =
		 d.findElement(By.xpath("(//div[@data-type='BOT_RESPONSE_text'])[2]"))
		 .getText(); 
		  System.out.println("actual    :  "+actualreslut); // answer from server
		  String mapedres = ChatBotUtilities.getResponse(q); 
		  System.out.println("maped result   :  "+mapedres);
		 if(actualreslut.contains(mapedres)) {
			 System.out.println("Test passed");
		  }else
			  System.out.println("Test Faild ");
		 d.switchTo().defaultContent();
		 */

        String q = "how are you?";
        //open browser and Launch site
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chatbot.com/");
        Thread.sleep(5000);
        //Activate chat-bot dialog
        driver.switchTo().frame("chat-widget");
        driver.findElement(By.className("lazy-img-loaded")).click();
        Thread.sleep(5000);
        //send question to server
        driver.findElement(By.xpath("//*[@placeholder='Type your message here']"))
                .sendKeys(q, Keys.ENTER);
        Thread.sleep(5000);
        //Get actual answer given by server
        String actualres = driver.findElement(By.xpath(
                "(//div[@data-Type='BOT_RESPONSE_text'])[2]")).getText();
        System.out.println(actualres); //answer came from server for given question
        //Compare with expected answer paired for given question in "static" block
        String mappedres = ChatBotUtilities.getResponse(q);
        System.out.println(mappedres);
        if (actualres.contains(mappedres)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

    }
}