package sanjeev1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bashabhai 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.ebay.com/");
		driver.findElement(By.id("gh-ac")).sendKeys("sony");
		driver.findElement(By.id("gh-btn")).click();
		driver.close();
	}

}
