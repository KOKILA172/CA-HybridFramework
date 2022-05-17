package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Productsearch {
	public WebDriver driver;
	
	By search=By.xpath("//input[@placeholder='Search']");
	By enter=By.xpath("//header/div[1]/div[1]/section[2]/div[1]/form[1]/div[1]/button[1]/span[1]");
	
			
	public Productsearch(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement getSearch() {
		// TODO Auto-generated method stub
		return driver.findElement(search);
	}
	public WebElement getEnter() {
		// TODO Auto-generated method stub
		return driver.findElement(enter);
	}
	
}
