package seleniumpoc.testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import seleniumpoc.pages.DashBoardPage;
import seleniumpoc.pages.LoginPage;
import seleniumpoc.pages.PIMPage;

public class UserCreationTest extends BaseTest {

	@Test
	public void verifyUserCreationFlow()
	{
		String profilePicPath = "C:\\Users\\WIN 10.DESKTOP-VBBJ1UA\\OneDrive\\Desktop\\FileUpload.exe";
		
		LoginPage loginPage=launchApplication();

		DashBoardPage dashboardpage = loginPage.doLogin("Admin", "admin123");

		PIMPage pimPage = dashboardpage.goToPIM();

		pimPage.clickOnaddEmplyoe();
		pimPage.uploadProfilePic(profilePicPath);
		pimPage.addEmployeeDetails("localAdmin", "Testuser", "1424");
		pimPage.addLoginDetails("local", "local123");

	}

}
