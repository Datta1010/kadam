package Com.Utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Com.BaseLayer.BaseClass;

public class ExtendReportsetup extends BaseClass {

	public static void passScrenshot() {
		TakesScreenshot sc = (TakesScreenshot) driver;
		File file = sc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, "C:\\cucumber poject\\project\\passScreenshot");

	}

}
