package com.regular.expressionn;

import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void method() {
		String str ="hi3how45are565you";
		String replaced = str.replaceAll("[0-9]+", "");
		System.out.println(replaced);
		
	}

}
