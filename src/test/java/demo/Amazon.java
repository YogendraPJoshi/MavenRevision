package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void amazonTest() throws InterruptedException
  {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.close();
	  Thread.sleep(3000);
	  System.out.println("HI I MADE CHANGE");
  }
}
