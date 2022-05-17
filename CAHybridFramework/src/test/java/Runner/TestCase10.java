package Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.NavigationPage;
import utility.BaseClass;
import utility.Screenshot;

public class TestCase10 extends BaseClass {
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {

		driver = initializeDriver();

	}

	@Test
	public void Test10navigation() throws IOException, InterruptedException {

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		NavigationPage n = new NavigationPage(driver);
		n.getSale().click();
		Thread.sleep(3000);
		n.getLiving().click();
		Thread.sleep(3000);
		n.getRoom().click();
		Thread.sleep(3000);
		n.getMattresses().click();
		Thread.sleep(3000);
		n.getDining().click();
		Thread.sleep(3000);
		n.getStorage().click();
		Thread.sleep(3000);
		n.getStudy().click();
		Thread.sleep(3000);
		n.getKidsroom().click();
		Thread.sleep(3000);
		n.getDecor().click();
		Thread.sleep(3000);
		n.getColection().click();
		Thread.sleep(3000);
		log.info("pages are navigating");
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