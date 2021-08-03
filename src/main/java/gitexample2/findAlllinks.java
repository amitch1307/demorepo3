package gitexample2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class findAlllinks {
	
	@Test
	public void findAllPagelinks() {
		WebDriver  driver; 
		ChromeDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--incognito");
		
		option.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		driver = new ChromeDriver(option);
		driver.get("http://172.16.1.32/ALiSNJDOH2TESTING11.0.114.01/LoginNJDOH.aspx");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> alllink= driver.findElements(By.tagName("a"));
		System.out.println(alllink.size());
		
		
		
	}
	

}
