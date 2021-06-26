package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectDemo {
	WebDriver driver;
	By From=By.xpath("//span[text()='From']");
	By From_place=By.xpath("//input[@placeholder='From']");	
	By Key1=By.xpath("//input[@placeholder='From']");
	By Key2=By.xpath("//input[@placeholder='From']");
	
	By To=By.xpath("//span[text()='To']");
	By To_place=By.xpath("//input[@placeholder='To']");
	By Key3=By.xpath("//input[@placeholder='To']");
	By Key4=By.xpath("//input[@placeholder='To']");
	
	By search=By.xpath("//a[text()='Search']");
	
	By date1=By.xpath("//input[@title=\"Mon, Jun 21, 2021\"]");
	By date2=By.xpath("//span[@role=\"button\" and @aria-label=\"Next Month\"]");
	By date3=By.xpath("//div[@aria-label=\"Friday, 20 August 2021\"]");
	
	public PageObjectDemo(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Fromplace() throws InterruptedException
	{
		driver.findElement(From).click();
		Thread.sleep(3000);
		driver.findElement(From_place).sendKeys("Pune");
		driver.findElement(Key1).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(Key2).sendKeys(Keys.ENTER);
	}
	
	public void Toplace() throws InterruptedException
	{
		driver.findElement(To).click();
		Thread.sleep(3000);
		driver.findElement(To_place).sendKeys("Mumbai");
		driver.findElement(Key3).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(Key4).sendKeys(Keys.ENTER);
	}
	
	public void search() 
	{
		driver.findElement(search).click();
	}
	
	public void selectdate()
	{
		driver.findElement(date1).click();
		driver.findElement(date2).click();
		driver.findElement(date3).click();
	}
	
	public void Viewfare()
	{
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
	}
	
	public void Booknow()
	{
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
