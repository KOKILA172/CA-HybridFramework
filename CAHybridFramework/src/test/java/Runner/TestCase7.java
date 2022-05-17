package Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.ValidatingTitle;
import utility.BaseClass;
import utility.Screenshot;

public class TestCase7 extends BaseClass {
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {

		driver = initializeDriver();

	}

	@Test
	public void Test7navigation() throws IOException, InterruptedException {

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

		ValidatingTitle v = new ValidatingTitle(driver);
		
		v.getTrack().click();
		v.getOrder().sendKeys("1234");
		v.getPhone().sendKeys("9888888888");
		v.getSubmit().click();
		log.info("navigated to track order page");
	}
	@AfterMethod()
	public void tearDownMethod(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			Screenshot.captureScreenshot(driver);
		}
	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}
}
