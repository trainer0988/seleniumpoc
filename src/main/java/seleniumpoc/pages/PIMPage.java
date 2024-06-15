package seleniumpoc.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage {

	WebDriver driver;

	public PIMPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//nav[@aria-label = 'Topbar Menu' ]/ul/li[3]/a")
	WebElement addEmployeLink;

	@FindBy(xpath = "//img[@class = 'employee-image']")
	WebElement profilePicAddLink;

	@FindBy(name = "firstName")
	WebElement firstNameField;

	@FindBy(name = "lastName")
	WebElement lastNameField;

	@FindBy(xpath = "//label[text() = 'Employee Id']/parent::div/parent::div/div[2]/input")
	WebElement empIdField;

	@FindBy(xpath = "//*[@type = 'checkbox']/parent::label/span")
	WebElement createLoginDetails;

	@FindBy(xpath = "//div[@class = 'orangehrm-employee-form']/div[3]/div/div[1]/div/div[2]/input")
	WebElement userNameFiled;

	@FindBy(xpath = "//div[@class = 'orangehrm-employee-form']/div[4]/div/div[1]/div/div[2]/input")
	WebElement passwordField;

	@FindBy(xpath = "//div[@class = 'orangehrm-employee-form']/div[4]/div/div[2]/div/div[2]/input")
	WebElement confirmPasswordField;

	@FindBy(xpath = "//button[text()= ' Save ']")
	WebElement saveButton;

	public void clickOnaddEmplyoe() {
		addEmployeLink.click();
	}

	public void uploadProfilePic(String path) {
		profilePicAddLink.click();

		try {
			Runtime.getRuntime().exec(path);
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//	// driver.findElement(By.xpath("//*[@type = 'file']")).sendKeys("C:\\Users\\WIN
		// 10.DESKTOP-VBBJ1UA\\OneDrive\\Desktop\\status.png");

	}
	
	public void addEmployeeDetails(String firstName,String lastname, String empid)
	{
		firstNameField.sendKeys(firstName);
		lastNameField.sendKeys(lastname);
		empIdField.sendKeys(empid);
	}
	
	public void addLoginDetails(String userName, String password)
	{
		createLoginDetails.click();
		userNameFiled.sendKeys(userName);
		passwordField.sendKeys(password);
		confirmPasswordField.sendKeys(password);
		saveButton.click();
		
		
	}
	
}
