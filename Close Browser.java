import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseBrowser {

	public static void main(String[] args) throws InterruptedException {

		String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";
		String driverpath=System.setProperty("webdriver.gecko.driver", url);
		WebDriver driver = new FirefoxDriver();
		System.out.println(driverpath);
		driver.navigate().to("https://google.com");
		Thread.sleep(5000); //first site will be loaded and then browser will be closed. Waiting time is 5 seconds.
		driver.quit();
		
		
		
	}

}
