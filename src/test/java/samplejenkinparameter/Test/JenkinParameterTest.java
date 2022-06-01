package samplejenkinparameter.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinParameterTest {
	@Test
	public void parameter()
	{
		WebDriver driver=null;
		String browser=System.getProperty("browser");
		
		String url=System.getProperty("url");
		switch(browser)
		{
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		}
		driver.get(url);
		driver.quit();
		//sbcsd
		//comment by alfiya jabbar
	}
}
