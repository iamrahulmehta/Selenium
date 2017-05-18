import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";
String drivepath=System.setProperty("webdriver.gecko.driver", url);
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");	
String title="Facebook - Log In or Sign Up";
String actualTitle=driver.getTitle();
if(title.equals(actualTitle))
{
System.out.println("Title Matched");	
}
else
{
	System.out.println("Title not matched");
	
}


	}

}
