package gitexample2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
 
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RemoveInforbarinChrome {
	WebDriver driver;
	@Test
	public void RemoveIfobar() {
		 
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		
		option.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		
		driver = new ChromeDriver(option);
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

}
