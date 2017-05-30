package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";	
		String drivepath=System.setProperty("webdriver.gecko.driver", url);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	String sheetpath=System.getProperty("user.dir")+"\\src\\TestData\\TestData.xlsx";
	Xls_Reader xlr=new Xls_Reader(sheetpath); 

			int rcount= xlr.getRowCount("Login");
			
			for(int i=2;i<=rcount;i++)
			{
			
		String vRun=xlr.getCellData("Login", "Run", i);
		String param1=xlr.getCellData("Login", "Parameter 1", i);
		String param2=xlr.getCellData("Login", "Parameter 2", i);
		String param3=xlr.getCellData("Login", "Parameter 3", i);
		String param4=xlr.getCellData("Login", "Parameter 4", i);
		String param5=xlr.getCellData("Login", "Parameter 5", i);
		String param6=xlr.getCellData("Login", "Parameter 6", i);
		String param7=xlr.getCellData("Login", "Parameter 7", i);
		String param8=xlr.getCellData("Login", "Parameter 8", i);
		
		
			if(vRun.equalsIgnoreCase("On"))
				{				
			String expected=xlr.getCellData("Login", "Expected Result", i);
			String tsummary=xlr.getCellData("Login", "Test_Summary", i);

switch (tsummary)
{
	case "To test the URL":
	String actualUrl=driver.getCurrentUrl();
	xlr.setCellData("Login", "Actual Result", i, actualUrl);
	if(expected.equals(actualUrl))
	{
		xlr.setCellData("Login", "Status", i, "Passed");
		
	}
	else
	{
		
		xlr.setCellData("Login", "Status", i, "Failed");
	
	}
	break;
	
	case "To check login Functionality":
	driver.findElement(By.id("email")).sendKeys(param1);
	driver.findElement(By.id("pass")).sendKeys(param2);
	driver.findElement(By.id("u_0_q")).click();
	Thread.sleep(5000);
	boolean login=driver.findElement(By.id("userNavigationLabel")).isDisplayed();	
	
	if(login == true)
	{
		xlr.setCellData("Login", "Actual Result", i, "Logged in Successfuly");
		xlr.setCellData("Login", "Status", i, "Passed");
	}
	/*else if (notLogin==true)
	{
		xlr.setCellData("Login", "Actual Result", i, "Failed to log in");
		xlr.setCellData("Login", "Status", i, "Failed");	
	}*/
	
	break;
	
	case "Registering on Facebook":
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(param1);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(param2);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9996916900");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(param4);
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys(param5);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys(param6);
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys(param7);
		driver.findElement(By.xpath("//label[@for='u_0_h']")).click();
		driver.findElement(By.xpath("//button[@id='u_0_l']")).click();
		Thread.sleep(5000);

		try{
		boolean reg=driver.findElement(By.id("userNavigationLabel")).isDisplayed();
		System.out.println(reg);
		if(reg==true)
		{
				xlr.setCellData("Login", "Status", i, "Passed");
				xlr.setCellData("Login", "Actual Result", i, "Registration successfulll");

		}
		}
		catch (Exception e)
		{
			System.out.println(e);
			boolean notReg=driver.findElement(By.xpath("//input[@name='firstname']")).isDisplayed();
			if(notReg==true)
			{
				xlr.setCellData("Login", "Status", i, "Failed");
				xlr.setCellData("Login", "Actual Result", i, "Registration unsuccessful");

			}
		}
	
				
			
		
	break;
	
				case "Registering on Facebook with invalid number":
					driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(param1);
					driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(param2);
					driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(param3);
					driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(param4);
					driver.findElement(By.xpath("//select[@id='day']")).sendKeys(param5);
					driver.findElement(By.xpath("//select[@id='month']")).sendKeys(param6);
					driver.findElement(By.xpath("//select[@id='year']")).sendKeys(param7);
					driver.findElement(By.xpath("//label[@for='u_0_h']")).click();
					driver.findElement(By.xpath("//button[@id='u_0_l']")).click();
					Thread.sleep(5000);

					try{
						boolean notReg=driver.findElement(By.xpath("//input[@name='firstname']")).isDisplayed();
						if(notReg==true)
						{
							xlr.setCellData("Login", "Status", i, "Failed");
							xlr.setCellData("Login", "Actual Result", i, "Registration unsuccessful");

						}
					}
					catch (Exception e)
					{
						System.out.println(e);

						boolean reg=driver.findElement(By.id("userNavigationLabel")).isDisplayed();
						System.out.println(reg);
						if(reg==true)
						{
								xlr.setCellData("Login", "Status", i, "Passed");
								xlr.setCellData("Login", "Actual Result", i, "Registration successfulll");

						}

						
					}
					
					break;
					
				case "Registering on Facebook with 11 digit number":
					driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(param1);
					driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(param2);
					driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("98765465465");
					driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(param4);
					driver.findElement(By.xpath("//select[@id='day']")).sendKeys(param5);
					driver.findElement(By.xpath("//select[@id='month']")).sendKeys(param6);
					driver.findElement(By.xpath("//select[@id='year']")).sendKeys(param7);
					driver.findElement(By.xpath("//label[@for='u_0_h']")).click();
					driver.findElement(By.xpath("//button[@id='u_0_l']")).click();
					Thread.sleep(5000);

					try{
						boolean notReg=driver.findElement(By.xpath("//input[@name='firstname']")).isDisplayed();
						if(notReg==true)
						{
							xlr.setCellData("Login", "Status", i, "Failed");
							xlr.setCellData("Login", "Actual Result", i, "Registration unsuccessful");

						}
					}
					catch (Exception e)
					{
						System.out.println(e);

						boolean reg=driver.findElement(By.id("userNavigationLabel")).isDisplayed();
						System.out.println(reg);
						if(reg==true)
						{
								xlr.setCellData("Login", "Status", i, "Passed");
								xlr.setCellData("Login", "Actual Result", i, "Registration successfulll");

						}

						
					}
					break;	
				case "Registering on Facebook with 9 digit number":
					driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(param1);
					driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(param2);
					driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("987654654");
					driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(param4);
					driver.findElement(By.xpath("//select[@id='day']")).sendKeys(param5);
					driver.findElement(By.xpath("//select[@id='month']")).sendKeys(param6);
					driver.findElement(By.xpath("//select[@id='year']")).sendKeys(param7);
					driver.findElement(By.xpath("//label[@for='u_0_h']")).click();
					driver.findElement(By.xpath("//button[@id='u_0_l']")).click();
					Thread.sleep(5000);

					try{
						boolean notReg=driver.findElement(By.xpath("//input[@name='firstname']")).isDisplayed();
						if(notReg==true)
						{
							xlr.setCellData("Login", "Status", i, "Failed");
							xlr.setCellData("Login", "Actual Result", i, "Registration unsuccessful");

						}
					}
					catch (Exception e)
					{
						System.out.println(e);

						boolean reg=driver.findElement(By.id("userNavigationLabel")).isDisplayed();
						System.out.println(reg);
						if(reg==true)
						{
								xlr.setCellData("Login", "Status", i, "Passed");
								xlr.setCellData("Login", "Actual Result", i, "Registration successfulll");

						}

						
					}
					break;
					
				case "Registering on Facebook with vaid email":
					driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(param1);
					driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(param2);
					driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(param3);
					driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(param3);
					driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(param4);
					driver.findElement(By.xpath("//select[@id='day']")).sendKeys(param5);
					driver.findElement(By.xpath("//select[@id='month']")).sendKeys(param6);
					driver.findElement(By.xpath("//select[@id='year']")).sendKeys(param7);
					driver.findElement(By.xpath("//label[@for='u_0_h']")).click();
					driver.findElement(By.xpath("//button[@id='u_0_l']")).click();
					Thread.sleep(10000);

					try{
					boolean reg=driver.findElement(By.linkText("Didn't get a code?")).isDisplayed();
					System.out.println(reg);
					if(reg==true)
					{
							xlr.setCellData("Login", "Status", i, "Passed");
							xlr.setCellData("Login", "Actual Result", i, "Registration successfulll");

					}
					}
					catch (Exception e)
					{
						System.out.println(e);
						boolean notReg=driver.findElement(By.xpath("//input[@name='firstname']")).isDisplayed();
						if(notReg==true)
						{
							xlr.setCellData("Login", "Status", i, "Failed");
							xlr.setCellData("Login", "Actual Result", i, "Registration unsuccessful");

						}
					}		
				break;	
				
				
				case "Registering on Facebook with invalid email":
					driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(param1);
					driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(param2);
					driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(param3);
					driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(param3);
					driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(param4);
					driver.findElement(By.xpath("//select[@id='day']")).sendKeys(param5);
					driver.findElement(By.xpath("//select[@id='month']")).sendKeys(param6);
					driver.findElement(By.xpath("//select[@id='year']")).sendKeys(param7);
					driver.findElement(By.xpath("//label[@for='u_0_h']")).click();
					driver.findElement(By.xpath("//button[@id='u_0_l']")).click();
					Thread.sleep(10000);

					try{
					boolean reg=driver.findElement(By.linkText("Didn't get a code?")).isDisplayed();
					System.out.println(reg);
					if(reg==true)
					{
							xlr.setCellData("Login", "Status", i, "Passed");
							xlr.setCellData("Login", "Actual Result", i, "Registration successfulll");

					}
					}
					catch (Exception e)
					{
						System.out.println(e);
						boolean notReg=driver.findElement(By.xpath("//input[@name='firstname']")).isDisplayed();
						if(notReg==true)
						{
							xlr.setCellData("Login", "Status", i, "Failed");
							xlr.setCellData("Login", "Actual Result", i, "Registration unsuccessful");

						}
					}		
					break;
					
				case "Registering on Facebook with invalid email, no site":
					driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(param1);
					driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(param2);
					driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(param3);
					driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(param3);
					driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(param4);
					driver.findElement(By.xpath("//select[@id='day']")).sendKeys(param5);
					driver.findElement(By.xpath("//select[@id='month']")).sendKeys(param6);
					driver.findElement(By.xpath("//select[@id='year']")).sendKeys(param7);
					driver.findElement(By.xpath("//label[@for='u_0_h']")).click();
					driver.findElement(By.xpath("//button[@id='u_0_l']")).click();
					Thread.sleep(10000);

					try{
					boolean reg=driver.findElement(By.linkText("Didn't get a code?")).isDisplayed();
					System.out.println(reg);
					if(reg==true)
					{
							xlr.setCellData("Login", "Status", i, "Passed");
							xlr.setCellData("Login", "Actual Result", i, "Registration successfulll");

					}
					}
					catch (Exception e)
					{
						System.out.println(e);
						boolean notReg=driver.findElement(By.xpath("//input[@name='firstname']")).isDisplayed();
						if(notReg==true)
						{
							xlr.setCellData("Login", "Status", i, "Failed");
							xlr.setCellData("Login", "Actual Result", i, "Registration unsuccessful");

						}
					}
					break;
					
				}
					
							

}
					
			

	
	
}
			
				
				}
			

	
	}




