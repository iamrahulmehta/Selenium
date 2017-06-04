import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling {
	
	public static void main(String args[]) throws InterruptedException
	{
		
	
	
	String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";
	String drivepath=System.setProperty("webdriver.gecko.driver", url);
	WebDriver driver=new FirefoxDriver();
	
		driver.get("file:///E:/Automation%20Testing%20Tools/template/index.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h3[text()='Alert Handling Practice']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Alert Box']")).click();
		Alert alt=driver.switchTo().alert();
		String actualMsg=alt.getText();
		String expMsg="This is a warning message!";
		
		if(expMsg.equals(actualMsg))
		{
			alt.accept();
			System.out.println("Working");
		}
				
		driver.findElement(By.xpath("//input[@value='Confirm Box']")).click();
		String actMsg=alt.getText();
		String exppMsg="Do you want to continue ?";
		if(actMsg.equals(exppMsg))
		{
			alt.accept();
		}
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='PromptBox']")).click();
		alt.sendKeys("Ki haal chaal?");

	}

}
