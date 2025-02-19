package Ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;




//Usecase 1: As a user, I want to login to ebay.in and search for "JBL Speakers" Then I want to check the day's deals
public class EbaySearch {
	static WebDriver driver;

	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
			
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox/firefox.exe");
		
		driver = new FirefoxDriver(options);
		driver.get("https://www.ebay.com/");

	}
	
	
	public void searchProduct() {
		driver.findElement(By.id("gh-ac")).sendKeys("JBL Speakers");
		driver.findElement(By.id("gh-search-btn")).click();
		driver.findElement(By.linkText("Daily Deals")).click();
	}
	
	public void printTitleOfPage() {
		String currentTitlePage=driver.getTitle();
		System.out.println("Title of a Current Page is : "+currentTitlePage);
		
	}
	
	public void closeBroser() {
		driver.close();
	}

	public static void main(String[] args) {

		EbaySearch ebay = new EbaySearch();
		ebay.launchBrowser();
		ebay.searchProduct();
		
//		Usecase 2: From ebay.in, navigate to Simplilearn website. And navigate back to ebay.in
		EbayNavigateBack navigate= new EbayNavigateBack();
		navigate.navigateBack(driver);
		

//		Usecase 3: From ebay.in, I want to print the page title and close the browser
		ebay.printTitleOfPage();
		
		ebay.closeBroser();
		
	}

}
