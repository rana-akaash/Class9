package Framework.Testntass8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class classloginwithreport {
	WebDriver driver;
 
	@Test(priority=1)
	public void login() throws InterruptedException
	{
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\USER\\Desktop\\Selenium\\course data\\Tools\\chromedriver_win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
		
	}
	@Test(priority=2)
	public void loginwithemptycred() throws InterruptedException
	{

		WebElement userName = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        userName.sendKeys("");
        password.sendKeys("");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000);
        String errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
        Thread.sleep(3000);
        Assert.assertNotEquals("Epic sadface: Username is required", "errorMessage");  
        Thread.sleep(3000);
        System.out.println("Assert passed , "+errorMessage);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='error-button']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")).click();
        Thread.sleep(3000);
		
	}
	@Test(priority=3)
	public void loginwithemptyemail() throws InterruptedException
	{

		WebElement userName1 = driver.findElement(By.id("user-name"));
        WebElement password1 = driver.findElement(By.id("password"));
        userName1.sendKeys("");
        password1.sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        System.out.println("loginwithemptyemail run");
        Thread.sleep(3000);
        String errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
        Thread.sleep(3000);
        Assert.assertNotEquals("Epic sadface: Username is required", "errorMessage");  
        Thread.sleep(3000);
        System.out.println("Assert passed , "+errorMessage);
        driver.findElement(By.xpath("//button[@class='error-button']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")).click();
        Thread.sleep(3000);
        password1.clear();
        Thread.sleep(3000);
		
	}
	
	@Test(priority=4)
	public void loginwithemptypassword() throws InterruptedException
	{

		WebElement userName2 = driver.findElement(By.id("user-name"));
        WebElement password2 = driver.findElement(By.id("password"));
        userName2.sendKeys("standard_user900is");
        password2.sendKeys("");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000);
        String errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
        Thread.sleep(3000);
        Assert.assertNotEquals("Epic sadface: Password is required", "errorMessage");  
        Thread.sleep(3000);
        System.out.println("Assert passed , "+errorMessage);
        driver.findElement(By.xpath("//button[@class='error-button']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")).click();
        Thread.sleep(3000);
        userName2.clear();
        Thread.sleep(3000);
		
	}
	@Test(priority=5)
	public void loginwithwrongcred() throws InterruptedException
	{

		WebElement userName3 = driver.findElement(By.id("user-name"));
        WebElement password3 = driver.findElement(By.id("password"));
        userName3.sendKeys("sd_user844T5");
        password3.sendKeys("s45Buce6");
        driver.findElement(By.id("login-button")).click();
        System.out.println("loginwithwrongpassword run");
        Thread.sleep(3000);
        String errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
        Thread.sleep(3000);
        Assert.assertNotEquals("Epic sadface: Username and password do not match any user in this service", "errorMessage");  
        Thread.sleep(3000);
        System.out.println("Assert passed , "+errorMessage);
        driver.findElement(By.xpath("//button[@class='error-button']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")).click();
        Thread.sleep(3000);
        userName3.clear();
        password3.clear();
        Thread.sleep(3000);
		
	}
	@Test(priority=6)
	public void loginwithwrongemail() throws InterruptedException
	{

		WebElement userName4 = driver.findElement(By.id("user-name"));
        WebElement password4 = driver.findElement(By.id("password"));
        userName4.sendKeys("standard_user844T5");
        password4.sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        System.out.println("loginwithwrongpassword run");
        Thread.sleep(3000);
        String errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
        Thread.sleep(3000);
        Assert.assertNotEquals("Epic sadface: Username and password do not match any user in this service", "errorMessage");  
        Thread.sleep(3000);
        System.out.println("Assert passed , "+errorMessage);
        driver.findElement(By.xpath("//button[@class='error-button']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")).click();
        Thread.sleep(3000);
        userName4.clear();
        password4.clear();
        Thread.sleep(3000);
		
	}
	@Test(priority=7)
	public void loginwithwrongpassword() throws InterruptedException
	{

		WebElement userName5 = driver.findElement(By.id("user-name"));
        WebElement password5 = driver.findElement(By.id("password"));
        userName5.sendKeys("standard_user");
        password5.sendKeys("secret_saucettrT33");
        driver.findElement(By.id("login-button")).click();
        System.out.println("loginwithwrongpassword run");
        Thread.sleep(3000);
        String errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
        Thread.sleep(3000);
        Assert.assertNotEquals("Epic sadface: Username and password do not match any user in this service", "errorMessage");  
        Thread.sleep(3000);
        System.out.println("Assert passed , "+errorMessage);
        driver.findElement(By.xpath("//button[@class='error-button']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")).click();
        Thread.sleep(3000);
        userName5.clear();
        password5.clear();
        Thread.sleep(3000);
		
	}
	@Test(priority=8)
	public void loginwithvalidcred() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement userName6 = driver.findElement(By.id("user-name"));
        WebElement password6 = driver.findElement(By.id("password"));
        Thread.sleep(3000);
        userName6.sendKeys("error_user");
        password6.sendKeys("secret_sauce");
        Thread.sleep(3000);
        driver.findElement(By.id("login-button")).click();
        System.out.println("loginwithvalidcred run");
        Thread.sleep(3000);
        String message = driver.findElement(By.cssSelector(".app_logo")).getText();
        Thread.sleep(3000);
        Assert.assertNotEquals("Swag Labs", "message");  
        Thread.sleep(3000);
        System.out.println("Assert passed , "+message);
        Thread.sleep(3000);
	}
	
}
