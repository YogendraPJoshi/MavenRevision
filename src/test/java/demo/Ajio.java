package demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ajio 
{
	public static Logger logger;
	
  @Test
  public void ajioTest() throws InterruptedException
  {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.ajio.com/");
	  logger = logger.getLogger("My Java");
		PropertyConfigurator.configure("Log4j.properties");
		
		logger.info("Test");
		logger.error("Error");
		logger.warn("warning");
	  //Assert.fail();
	  driver.close();
	  Thread.sleep(3000);
	  
  }
}
