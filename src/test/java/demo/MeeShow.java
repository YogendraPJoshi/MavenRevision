package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeeShow {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
		  driver.get("https://www.meesho.com/");
		  driver.close();
		  Thread.sleep(3000);

	}

}
