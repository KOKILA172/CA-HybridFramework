package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	
	By login=By.xpath("//header/div[1]/div[1]/section[3]/ul[1]/li[2]/span[1]/*[1]");
	By clicklogin=By.xpath("//*[@id='header']/div[1]/div/section[3]/ul/li[2]/span/ul/li[1]/a");	
	By email=By.xpath("//input[@placeholder='Email Address']");
	By password=By.xpath("//input[@placeholder='Password']");
	By submit=By.xpath("//input[@value='Log In']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	

	public WebElement getLogin() {
		// TODO Auto-generated method stub
		return driver.findElement(login);
	}
	public WebElement getClickLogin() {
		// TODO Auto-generated method stub
		return driver.findElement(clicklogin);
	}
	public WebElement getEmail() {
		// TODO Auto-generated method stub
		return driver.findElement(email);
	}
	public WebElement getPassword() {
		// TODO Auto-generated method stub
		return driver.findElement(password);
	}
	public WebElement getSubmit() {
		// TODO Auto-generated method stub
		return driver.findElement(submit);
	}


	
}
