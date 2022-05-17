package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidatingTitle {

	public WebDriver driver;
	
	By title=By.xpath("//header/section[1]/div[1]/ul[2]/li[1]/a[1]");
	By text=By.xpath("//a[contains(text(),'Bulk Orders')]");
	By track=By.xpath("//header/div[1]/div[1]/section[3]/ul[1]/li[1]/a[1]/span[1]/*[1]");
	By order=By.xpath("//input[@id='ip_379403698']");
	By phone=By.xpath("//input[@id='ip_394711104']");
	By submit=By.xpath("//span[contains(text(),'Submit')]");
	public ValidatingTitle(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getTitle() {
		// TODO Auto-generated method stub
		return driver.findElement(title);
	}
	public WebElement getText() {
		// TODO Auto-generated method stub
		return driver.findElement(text);
	}
	public WebElement getTrack() {
		// TODO Auto-generated method stub
		return driver.findElement(track);
	}
	public WebElement getOrder() {
		// TODO Auto-generated method stub
		return driver.findElement(order);
	}
	public WebElement getPhone() {
		// TODO Auto-generated method stub
		return driver.findElement(phone);
	}
	public WebElement getSubmit() {
		// TODO Auto-generated method stub
		return driver.findElement(submit);
	}
	

	
}
