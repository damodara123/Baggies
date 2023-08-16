package Execution;

import java.time.Duration;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.baggiesLogin;

public class loginExecution extends baggiesLogin{

	
	@BeforeClass
	public void Login() throws Exception 
	{
		driver=lunchUrl();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	
	@Test(priority = 1)
	public void username() 
	{
		enterEmail();		
	}

	@Test(priority = 2)
	public void password() 
	{
		enterPassword();		
	}
	
	@Test(priority = 3)
	public void login() throws Exception 
	{
		userLogin();
		
	}

}
