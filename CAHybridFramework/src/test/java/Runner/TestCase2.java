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

import PageObject.LoginPage;
import PageObject.ValidatingTitle;

import utility.BaseClass;
import utility.Screenshot;

public class TestCase2 extends BaseClass {
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	
	@BeforeTest
	public void initialze() throws IOException {

		driver = initializeDriver();
		

	}

	@Test
	public void Test2navigation() throws IOException, InterruptedException {

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize(); 
	
	ValidatingTitle v = new ValidatingTitle(driver);
	Thread.sleep(3000);
	Assert.assertEquals(v.getTitle().getText(), "Stores");
	Thread.sleep(3000);
	System.out.println(v.getTitle().getText());
	Thread.sleep(3000);
	Assert.assertEquals(v.getText().getText(), "Bulk Orders");
	Thread.sleep(3000);
	System.out.println(v.getText().getText());
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	log.info("Succesfully validated text message and title");
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
