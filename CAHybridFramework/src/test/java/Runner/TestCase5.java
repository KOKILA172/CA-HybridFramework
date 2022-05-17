package Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.Homepage;
import utility.BaseClass;
import utility.Screenshot;

public class TestCase5 extends BaseClass {
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	
	@BeforeTest
	public void initialze() throws IOException {

		driver = initializeDriver();
		

	}

	@Test
	public void Test5navigation() throws IOException, InterruptedException {

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize(); 
		Homepage h=new Homepage(driver); 
		h.getCart().click();
		Assert.assertEquals(h.getVerify().getText(), "Your cart is empty");
		System.out.println(h.getVerify().getText());
		h.getContinue().click();
		log.info("sucessfully checks cart is empty");
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
