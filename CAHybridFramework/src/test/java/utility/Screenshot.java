package utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public static void captureScreenshot(WebDriver driver) {
		 try {
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				 FileUtils.copyFile(src, new File("./ScreenShots"+getCurrentDateTime()+"Failure.png"));
			System.out.println("screenshot captured");
		 
		 } catch (IOException e) {
				System.out.println("unable to capture ss"+e.getMessage());
				
			}
		
	}

	 public static String getCurrentDateTime()
	 {
		 DateFormat customformat=new SimpleDateFormat("MM_dd_yyy_HH_mm_SS");
		 Date currentDate=new Date();
		 return customformat.format(currentDate);
		 

}
}
