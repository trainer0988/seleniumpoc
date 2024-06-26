package seleniumpoc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@name = 'username']")
	WebElement userNameField;
	
	@FindBy(xpath = "//input[@name = 'password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//button[text() = ' Login ']")
	WebElement loginButton;
	
	public DashBoardPage doLogin(String userName, String password)
	{
		userNameField.sendKeys(userName);
		passwordField.sendKeys(password);
		loginButton.click();
		return new DashBoardPage(driver);
		
	}
	
	
	
	

}
