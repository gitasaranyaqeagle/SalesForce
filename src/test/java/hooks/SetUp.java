package hooks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SetUp extends BaseClass{
	@Before
	public void login() {
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("gitasaranya@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf24$");
		driver.findElement(By.id("Login")).click();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
