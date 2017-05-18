import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {

String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";
String drivepath=System.setProperty("webdriver.gecko.driver", url);
WebDriver driver=new FirefoxDriver();
driver.get("http://facebook.com");	
driver.findElement(By.id("email")).sendKeys("Testing");
driver.findElement(By.id("pass")).sendKeys("Testing");
//driver.findElement(By.id("u_0_q")).submit();
//Or you can click instead of submit. 
driver.findElement(By.id("u_0_q")).click();



	}

}
