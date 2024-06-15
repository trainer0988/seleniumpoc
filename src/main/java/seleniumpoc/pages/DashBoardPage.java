package seleniumpoc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
WebDriver driver;
	
	public DashBoardPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//span[text() = 'PIM']")
	WebElement pimLink;
	

	
	public PIMPage goToPIM()
	{
		pimLink.click();
		return new PIMPage(driver);
	}
	
	public PIMPage goToLeave()
	{
		pimLink.click();
		return new PIMPage(driver);
	}
	
	public PIMPage goToTime()
	{
		pimLink.click();
		return new PIMPage(driver);
	}
	
}
