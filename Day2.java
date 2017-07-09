import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2 {
	public static void main(String args[]) throws InterruptedException
	{
		
		String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";
		String drivepath=System.setProperty("webdriver.gecko.driver", url);
		WebDriver driver= new FirefoxDriver();
		
		driver.navigate().to("http://facebook.com");
		
		driver.findElement(By.xpath("//input[@id='u_0_2']")).sendKeys("HI");
		driver.findElement(By.xpath("//input[@id='u_0_4']")).sendKeys("Hello");
		driver.findElement(By.id("u_0_7")).sendKeys("iamrahul@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_a")).sendKeys("iamrahul@gmail.com");
		driver.findElement(By.id("u_0_e")).sendKeys("password@123");
		
		Select bday= new Select(driver.findElement(By.name("birthday_day")));
		bday.selectByIndex(16);
		
		Select bmonth=new Select(driver.findElement(By.name("birthday_month")));
		bmonth.selectByValue("12");
		
		Select byear= new Select(driver.findElement(By.name("birthday_year")));
		byear.selectByValue("1991");
		
		int count = driver.findElements(By.name("sex")).size();
		driver.findElements(By.name("sex")).get(1).click();
		
		driver.findElement(By.id("u_0_m")).click();
		
		
	}
	
	

}
