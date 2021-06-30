package newpackage;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
public static void main(String[] args) throws InterruptedException, IOException
{
	Exceldata1 ex=new Exceldata1();
	String value=ex.filedata();
	String value1=ex.filedata1();
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//span[text()='From']")).click();
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(value);	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//span[text()='To']")).click();	
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(value1);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[text()='Search']")).click();
	driver.findElement(By.xpath("//div[@aria-label=\"Thursday, 1 July 2021\"]")).click(); 
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[@role=\"button\" and @aria-label=\"Next Month\"]")).click(); 
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@aria-label=\"Friday, 20 August 2021\"]")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
