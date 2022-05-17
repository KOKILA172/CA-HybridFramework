package Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.Productsearch;
import PageObject.ValidatingTitle;
import utility.BaseClass;
import utility.Screenshot;

public class TestCase3 extends BaseClass {
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {

		driver = initializeDriver();

	}

	@Test
	public void Test3navigation() throws IOException {

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Productsearch p = new Productsearch(driver);
		
		p.getSearch().sendKeys("aria table runner");
		p.getEnter().click();
		log.info("Succesfully found the product");
		
	}
	@AfterMethod()
	public void tearDownMethod(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
		Screenshot.captureScreenshot(driver);
	}
		

		
	}
	

	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}
	
}
