package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {

    public void captureFailureScreenShot(WebDriver driver, String name) throws IOException {
        // Interface & method for Capture Screenshot
        TakesScreenshot scrShot = (TakesScreenshot) driver;
        File screenShot = scrShot.getScreenshotAs(OutputType.FILE); // screenshot will store in temporary path "screenShot"

        // Creating folder using Java if it does not exist
        File screenshotDir = new File(System.getProperty("user.dir") + File.separator + "OutputScreenshots");
        if (!screenshotDir.exists()) {
            screenshotDir.mkdirs(); // mkdir --> will create folder using java make directory
        }

        // Date-time capture using Java
        String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());

        // Final destination for the screenshot
        File finalDestination = new File(screenshotDir, name + "_" + timeStamp + ".png");

        // Copy screenshot from temp path to project folder
        FileHandler.copy(screenShot, finalDestination);
    }
}