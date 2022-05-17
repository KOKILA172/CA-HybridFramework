package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	public WebDriver driver;
	By dropdown=By.xpath("//input[@placeholder='Search']");
	By cart=By.xpath("//header/div[1]/div[1]/section[3]/ul[1]/li[4]/a[1]/div[1]/span[1]/*[1]");
	By verify=By.xpath("//p[contains(text(),'Your cart is empty')]");
	By continueshopping =By.xpath("//a[contains(text(),'Continue shopping')]");
	By sale=By.xpath("//header/div[2]/div[1]/nav[1]/div[1]/ul[1]/li[1]/span[1]");
	By stores=By.xpath("//span[contains(text(),'Bangalore')]");
	By viewdetalis=By.xpath("//body/div[@id='app-container']/div[1]/main[1]/section[2]/div[1]/a[1]/div[3]/button[1]");
	By list=By.xpath("//header/div[1]/div[1]/section[3]/ul[1]/li[3]/a[1]/div[1]/span[1]/*[1]");
	By login=By.xpath("//body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/a[1]");
	By email=By.xpath("//input[@placeholder='Email Address']");
	By pw=By.xpath("//input[@placeholder='Password']");
	By log=By.xpath("//input[@id='ul_site_login']");
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	

	public WebElement getDropdown() {
		// TODO Auto-generated method stub
		return driver.findElement(dropdown);
	}
	public WebElement getCart() {
		// TODO Auto-generated method stub
		return driver.findElement(cart);
	}
	public WebElement getVerify() {
		// TODO Auto-generated method stub
		return driver.findElement(verify);
	}
	public WebElement getContinue() {
		// TODO Auto-generated method stub
		return driver.findElement(continueshopping);
	}
	public WebElement getSale() {
		// TODO Auto-generated method stub
		return driver.findElement(sale);
	}
	public WebElement getStores() {
		// TODO Auto-generated method stub
		return driver.findElement(stores);
	}
	public WebElement getView() {
		// TODO Auto-generated method stub
		return driver.findElement(viewdetalis);
	}
	public WebElement getList() {
		// TODO Auto-generated method stub
		return driver.findElement(list);
	}
	public WebElement getLogin() {
		// TODO Auto-generated method stub
		return driver.findElement(login);
	}
	public WebElement getEmail() {
		// TODO Auto-generated method stub
		return driver.findElement(email);
	}
	public WebElement getPassword() {
		// TODO Auto-generated method stub
		return driver.findElement(pw);
	}
	public WebElement getLog() {
		// TODO Auto-generated method stub
		return driver.findElement(log);
	}
	
}
