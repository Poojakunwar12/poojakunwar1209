package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		PageObjectDemo Page=new PageObjectDemo(driver);
		
		Thread.sleep(4000);
		Page.Fromplace();
		Thread.sleep(4000);
		Page.Toplace();
		Thread.sleep(3000);
		Page.search();
		Thread.sleep(3000);
		Page.selectdate();
		Thread.sleep(3000);
		Page.Viewfare();
		Thread.sleep(3000);
		Page.Booknow();
		
		
		
	}

}
