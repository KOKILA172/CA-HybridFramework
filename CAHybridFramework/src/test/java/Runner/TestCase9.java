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

public class TestCase9 extends BaseClass {
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {

		driver = initializeDriver();

	}

	@Test
	public void Test9navigation() throws IOException, InterruptedException {

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Homepage h = new Homepage(driver);
		Excelsheet e = new Excelsheet();
		h.getList().click();
		Thread.sleep(5000);
		h.getLogin().click();
		h.getEmail().sendKeys(e.getStringData("FirstSheet", 0, 0));
		h.getPassword().sendKeys(e.getStringData("FirstSheet", 0, 1));
		h.getLog().click();
		log.info("Sucessfully navigated to wishlist");
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
