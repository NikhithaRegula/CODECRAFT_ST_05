package ListenerLibrary;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import genericLibrary.BaseConfig;
import hooks.TestHooks;

public class ListenerImplementation implements ITestListener {

	public void onTestFailure(ITestResult result) {

		String methodname = result.getName();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		String customDate = sdf.format(new Date());

		// 1. Perform TypeCasting

		TakesScreenshot tsobj = (TakesScreenshot) TestHooks.driver;

		// 2. Capture the Screenshot and store it to temp path

		File tempath = tsobj.getScreenshotAs(OutputType.FILE);

		// 3. Create permanent path to store the screenshot

		File permanentpath = new File("./src/test/resources/TestScreenshot/" + methodname + customDate + ".png");

		// 4.copy SS from temppath into permanent path

		try {
			FileHandler.copy(tempath, permanentpath);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Screenshot taken successful");

	}
}

