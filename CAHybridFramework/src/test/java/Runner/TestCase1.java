package Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObject.LoginPage;
import utility.BaseClass;
import utility.Excelsheet;
import utility.Screenshot;

public class TestCase1 extends BaseClass {
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {

		driver = initializeDriver();

	}

	@Test
	public void Test1navigation() throws IOException, InterruptedException {

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

		LoginPage l = new LoginPage(driver);
		Excelsheet e = new Excelsheet();
		log.info("chrome is opened succesfully");
		l.getLogin().click();
		l.getClickLogin().click();
		l.getEmail().sendKeys(e.getStringData("FirstSheet", 0, 0));
		l.getPassword().sendKeys(e.getStringData("FirstSheet", 0, 1));
		l.getSubmit().click();
		Thread.sleep(5000);
		log.info("login is valid");
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
		driver = null;
	}
}
