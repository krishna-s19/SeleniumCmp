package com.chatbot.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.openBrowser.Utilities.BrowserUtilities;

public class Test1 {
	
	@Test
	 public void test() throws Exception {
	BrowserUtilities bu = new BrowserUtilities();
		String q= "how are you";
		bu.OpenBrowser();
		bu.d.get("https://www.chatbot.com/");
		bu.d.switchTo().frame("chatbot-chat-frame");
		bu.d.findElement(By.className("lazy-img-loaded")).click();
		Thread.sleep(3000);
		bu.d.findElement(By.xpath("//div[@class='typing']/input")).sendKeys(q,Keys.ENTER);
		Thread.sleep(3000);
		
		String result =bu.d.findElement(By.xpath("(//div[@data-type='BOT_RESPONSE_text'])[2]")).getText();
		System.out.println(result);
		
		String exp = ChatBotUtilities.getResponse(q);
		System.out.println(exp);
		if(result.contains(exp)) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test Faild");
		}
		bu.d.switchTo().defaultContent();
		//bu.d.close();
	}
}
