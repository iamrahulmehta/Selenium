package find;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Find {

	public static void main(String[] args) throws InterruptedException {

String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";
String drivepath=System.setProperty("webdriver.gecko.driver", url);
WebDriver driver=new FirefoxDriver();
driver.navigate().to("https://www.facebook.com/");
String expectedUrl="https://www.facebook.com/";
String actualUrl=driver.getCurrentUrl();
if(actualUrl.equals(expectedUrl))
{
	System.out.println("Test Passed");
}
else
	
{
	System.out.println("Test Failed");
}

/*driver.findElement(By.id("u_0_1")).sendKeys("Sanskari ");
driver.findElement(By.id("u_0_3")).sendKeys("kumar");
driver.findElement(By.id("u_0_6")).sendKeys("9041414141");
driver.findElement(By.id("u_0_d")).sendKeys("963852741");
driver.findElement(By.id("day")).sendKeys("12");
driver.findElement(By.id("month")).sendKeys("Feb");
driver.findElement(By.id("year")).sendKeys("1998");
driver.findElement(By.partialLinkText("Create")).click();
//driver.findElement(By.linkText("Forgotten account?")).click();
//driver.findElement(By.cssSelector("input[value='2']")).click();
driver.findElement(By.id("u_0_l")).click();*/

driver.findElement(By.id("email")).sendKeys("6586645");
driver.findElement(By.id("pass")).sendKeys("rahahhaahah");
driver.findElement(By.id("u_0_q")).click();
Thread.sleep(6000);
driver.findElement(By.id("userNavigationLabel")).click();
Thread.sleep(3000);
driver.findElement(By.className("_w0d")).submit();
//driver.findElement(By.partialLinkText("Log out")).click();





		
	}

}
