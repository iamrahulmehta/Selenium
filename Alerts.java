import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {
	
public static void main(String args[]) throws InterruptedException
{
String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";
String drivepath=System.setProperty("webdriver.gecko.driver", url);
WebDriver driver = new FirefoxDriver();

		driver.get("file:///E:/Automation%20Testing%20Tools/template/index.html");
		/*driver.findElement(By.xpath("//h3[text()='Alert Handling Practice']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Alert Box']")).click();
		Alert alt=driver.switchTo().alert();
		alt.accept();

		driver.findElement(By.xpath("//input[@value='Confirm Box']")).click();
		alt.dismiss();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='PromptBox']")).click();
		alt.sendKeys("Hanji");*/
		
		//IFRAME PRACTICE
		
		driver.findElement(By.xpath("//h3[text()='iFrame Handling']")).click();
		driver.switchTo().frame("IF1");
		driver.findElement(By.id("name")).sendKeys("Rahul Mehta");
		driver.findElement(By.id("mail")).sendKeys("rahulmehta@gmail.com");

		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("IF2");
/*		Thread.sleep(8000);
*/		driver.findElement(By.xpath("//input[@value='Alert Box']")).click();
		
		
		
		
		
		
		
		
		
	}
}
