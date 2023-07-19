package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipKart {
  @Test
  public void flipKarttest() throws InterruptedException
  {
	  
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.close();
	  Thread.sleep(3000);
	  System.out.println("HI GE");
	  System.out.println("Velocity made changes");
  }
}
