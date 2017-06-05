import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandling {
	
	public static void main(String args[])
	{
		String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";
		String drivepath=System.setProperty("webdriver.gecko.driver", url);
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///E:/Automation%20Testing%20Tools/template/index.html");	
		driver.findElement(By.xpath("//h3[text()='Mouse Over Practice']")).click();
		Actions act=new Actions(driver);
		WebElement elm = driver.findElement(By.xpath("//a[@title='Projects']"));  //we use interface WebElement just to locate and not click.
		act.moveToElement(elm).build().perform();
		
		WebElement elm1 = driver.findElement(By.xpath("//a[@title='Older projects']"));
		act.moveToElement(elm1).build().perform();
		
		/*WebElement elm2 = */driver.findElement(By.linkText("iFrame Handling")).click();
/*		act.moveToElement(elm2).build().perform();
*/	
	
}
}
