import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class GetLabel {

	public static void main(String[] args) {
		String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";
		String driverpath=System.setProperty("webdriver.gecko.driver", url);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		String label=driver.findElement(By.xpath("//label[@for='pass']")).getText();
		System.out.println(label);
		

		
	}

}
