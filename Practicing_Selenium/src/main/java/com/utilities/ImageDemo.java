package com.utilities;

import org.testng.annotations.Test;

public class ImageDemo {
	
	@Test
	public void getImagesDemo() {
		BrowserOpen bo = new BrowserOpen();
		bo.openBrowser();
		//bo.d.get("https://www.amazon.in");
		bo.d.get("https://www.ebay.com/");
		ImagesCollectingUtilities icu = new ImagesCollectingUtilities();
		icu.getAllImages(bo.d);
		
	}
}
