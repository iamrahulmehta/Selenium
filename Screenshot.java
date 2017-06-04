import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
	
public static void main(String args[]) throws IOException, InterruptedException
{
	String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";
	String drivepath=System.setProperty("webdriver.gecko.driver", url);
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://google.com");
	driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='_fZl']")).click();
	Thread.sleep(3000);

	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(scrFile, new File("C:\\Users\\Rahul Mehta\\Desktop\\screenshot.png"));
	

}
}
