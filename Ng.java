
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ng {

	@BeforeMethod
	public static void launch()
	{	
		System.out.println("Before Method Annotation");
	}
	
	@Test
	public void Print()
	{
		System.out.println("Before Method Annotation");	
		
	}
	
}
