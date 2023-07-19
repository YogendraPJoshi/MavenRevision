package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SanpDeal {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(5000);
		driver.close();
		

	}

}
