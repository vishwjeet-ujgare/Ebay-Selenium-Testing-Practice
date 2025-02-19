package Ebay;

import org.openqa.selenium.WebDriver;

 class EbayNavigateBack {
//	Usecase 2: From ebay.in, navigate to Simplilearn website. And navigate back to ebay.in

	public void navigateBack(WebDriver driver) {
		driver.navigate().to("https://www.simplilearn.com/");
		System.out.println("Successfully naviagate to simplilearn website");
		driver.navigate().back();
		System.out.println("Navigated Back to original that is ebay wesite");

	}
}
