import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";
String drivepath=System.setProperty("webdriver.gecko.driver", url);
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");	

driver.manage().window().maximize();
}
}