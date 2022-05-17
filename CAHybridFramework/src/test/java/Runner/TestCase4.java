package Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.Homepage;
import utility.BaseClass;
import utility.Screenshot;

public class TestCase4 extends BaseClass {
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	
	@BeforeTest
	public void initialze() throws IOException {

		driver = initializeDriver();
		

	}

	@Test
	public void Test4navigation() throws IOException, InterruptedException {

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize(); 
		Homepage h=new Homepage(driver);
		h.getDropdown().sendKeys("study chair white");
		h.getDropdown().sendKeys(Keys.ARROW_DOWN);
		h.getDropdown().sendKeys(Keys.ENTER);
		log.info("product found by using dropdown");
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