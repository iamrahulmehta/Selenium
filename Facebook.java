import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";
String drivepath=System.setProperty("webdriver.gecko.driver", url);
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");	
String expectedUrl= "https://www.facebook.com/";
String actualUrl=driver.getCurrentUrl();

if(actualUrl.equals(expectedUrl))
{
	System.out.println("Test Passed");
	}
else
{
	System.out.println("Test Failed");
	
}
 

/*driver.findElement(By.id("email")).sendKeys("Email or user name");
driver.findElement(By.id("pass")).sendKeys("Password");
driver.findElement(By.id("u_0_q")).click();
Thread.sleep(15000);
driver.findElement(By.id("userNavigationLabel")).click();
Thread.sleep(3000);
driver.findElement(By.partialLinkText("Log out")).click();*/



	}

}
