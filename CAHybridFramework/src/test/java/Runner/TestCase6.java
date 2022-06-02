package Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.Homepage;

import utility.BaseClass;
import utility.Excelsheet;
import utility.Screenshot;

public class TestCase6 extends BaseClass {
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {

		driver = initializeDriver();

	}

	@Test
	public void Test6navigation() throws IOException, InterruptedException {

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Homepage h = new Homepage(driver);
		h.getSale().click();
		h.getStores().click();
		h.getView().click();
		log.info("navigated to bangalore page");
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