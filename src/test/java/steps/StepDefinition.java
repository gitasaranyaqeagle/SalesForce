package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	public String string;
	@Given("Click on toggle menu button from the left corner")
	public void clickToggleMenu() {
	    // Click on toggle menu button from the left corner
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
	}

	@Given("Click view All and click Sales from App Launcher")
	public void clickViewAllAndSales() {
	//Click view All and click Sales from App Launcher
	    driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
			WebElement findElement = driver.findElement(By.xpath("//span/p[text()='Sales']"));
			driver.executeScript("arguments[0].scrollIntoView();", findElement);  
			findElement.click();
	}

	@Given("Click on Accounts tab")
	public void clickAccountsTab() {
	//Click on Accounts tab 
	    WebElement element = driver.findElement(By.xpath("//span[text()='Accounts']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("arguments[0].click();", element);
	}

	@Given("Click on New button")
	public void clickNewButton() {
	    //5. Click on New button
			 driver.findElement(By.linkText("New")).click();
	}

	@Given("Enter {string} as account name")
	public void enterAccountName(String string) {
	     //6. Enter 'your name' as account name
			 driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(string);
	}

	@Given("Select Ownership as Public")
	public void selectOwnership() throws InterruptedException {
	    //7. Select Ownership as Public  
			 WebElement ownership = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
				driver.executeScript("arguments[0].scrollIntoView();", ownership);  
				ownership.click();
	try {
					driver.findElement(By.xpath("(//span[text()='Public'])/parent::span")).click();
				} catch (Exception e) {
					// TODO: handle exception
					Thread.sleep(5000);
					driver.findElement(By.xpath("(//span[text()='Public'])/parent::span")).click();
				}
	}

	@When("Click save and verify Account name")
	public void clickSave() {
	    //8. Click save and verify Account name
				driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

	@Then("Account should be created Successfully")
	public void account_should_be_created_successfully() {
	    //Expected Result:Account should be created Successfully	
				String accountName = driver.findElement(By.xpath("(//slot[@name='primaryField'])/lightning-formatted-text")).getText();
	            System.out.println(accountName);
				if(accountName.equals(string))
					System.out.println("Account created successfully");
				
				driver.quit();
	}

}
