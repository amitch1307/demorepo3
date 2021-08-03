package gitexample2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
 
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class runbrowserincognito {
	WebDriver driver;
	@Test
	public void RunIncognito() {
		WebDriverManager.chromedriver().setup();
		 
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		  driver= new ChromeDriver(option);
		driver.get("http://172.16.1.32/ALiSNJDOH2TESTING11.0.114.01/LoginNJDOH.aspx");
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
		
	}

}
