package newpackage;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//span[text()='From']")).click();
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune");	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//span[text()='To']")).click();	
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Mumbai");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Search']")).click();
	driver.findElement(By.xpath("//input[@title=\"Mon, Jun 21, 2021\"]")).click(); 
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@role=\"button\" and @aria-label=\"Next Month\"]")).click(); 
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@aria-label=\"Friday, 20 August 2021\"]")).click();
	Thread.sleep(3000);
	int i=0;
	List <WebElement> buttons=driver.findElements(By.xpath("//span[text()='View Prices']"));
	for(WebElement we:buttons)
	{
		i++;
	
	if(i==1)
	{
		we.click();
	}
	}
	Thread.sleep(3000);
	int j=0;
	List <WebElement> buttons1=driver.findElements(By.xpath("//button[@class=\"button corp-btn latoBlack buttonPrimary fontSize13 \"]"));
	for(WebElement we1:buttons1)
	{
		j++;
	
	if(j==1)
	{
		we1.click();
	}
	}
	
}
}
