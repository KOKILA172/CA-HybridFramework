package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationPage {
	public WebDriver driver;
	By sale = By.xpath("//*[@id=\'topnav_wrapper\']/ul/li[1]/span");
	By living = By.xpath("//*[@id='topnav_wrapper']/ul/li[2]/span");
	By room = By.xpath("//*[@id=\'topnav_wrapper\']/ul/li[3]/span");
	By mattresses = By.xpath("//*[@id='topnav_wrapper']/ul/li[4]/span");
	By dining = By.xpath("//*[@id='topnav_wrapper']/ul/li[5]/span");
	By storage = By.xpath("//*[@id='topnav_wrapper']/ul/li[6]/span");
	By study = By.xpath("//*[@id='topnav_wrapper']/ul/li[7]/span");
	By kidsroom = By.xpath("//*[@id='topnav_wrapper']/ul/li[8]/span");
	By decor = By.xpath("//*[@id='topnav_wrapper']/ul/li[9]/span");
	By collection = By.xpath("//*[@id='topnav_wrapper']/ul/li[10]/span");

	public NavigationPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSale() {
		// TODO Auto-generated method stub
		return driver.findElement(sale);
	}

	public WebElement getLiving() {
		// TODO Auto-generated method stub
		return driver.findElement(living);
	}

	public WebElement getRoom() {
		// TODO Auto-generated method stub
		return driver.findElement(room);
	}

	public WebElement getMattresses() {
		// TODO Auto-generated method stub
		return driver.findElement(mattresses);
	}

	public WebElement getDining() {
		// TODO Auto-generated method stub
		return driver.findElement(dining);
	}

	public WebElement getStorage() {
		// TODO Auto-generated method stub
		return driver.findElement(storage);
	}

	public WebElement getStudy() {
		// TODO Auto-generated method stub
		return driver.findElement(study);
	}

	public WebElement getKidsroom() {
		// TODO Auto-generated method stub
		return driver.findElement(kidsroom);
	}

	public WebElement getDecor() {
		// TODO Auto-generated method stub
		return driver.findElement(decor);
	}

	public WebElement getColection() {
		// TODO Auto-generated method stub
		return driver.findElement(collection);
	}
}