package Pages;

import org.openqa.selenium.By;

import Base.browser;

public class baggiesLogin extends browser{

public By username = By.xpath("//input[@name='email']");
	
	public By password = By.xpath("//input[@name='password']");
	
	public By login = By.xpath("//button[@name='login']");
	
	
	
	
	public boolean enterEmail()
	{
		return enterText(username,"anji@ramanasoft.com");
	}
	public boolean enterPassword()
	{
		return enterText(password,"Ravan@123");
	}
	
	public boolean userLogin() 
	{
		return clickElement(login);
	}
	
}
