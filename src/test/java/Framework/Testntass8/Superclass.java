package Framework.Testntass8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Superclass {
	
	
	public void superCls() throws InterruptedException {
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\USER\\Desktop\\Selenium\\course data\\Tools\\chromedriver_win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
	}

}
