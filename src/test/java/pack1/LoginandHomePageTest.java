package pack1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnersTestNG.class)
public class LoginandHomePageTest {
	
	WebDriver driver;
	
	//@BeforeMethod()
	//public void setUP() throws Throwable {
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\saitejamamidi\\Oracle Content - Accounts\\Oracle Content\\Sai Teja\\Automation\\Selenium Practice\\SW\\geckodriver-v0.24.0-win64\\geckodriver.exe");
//	       driver=new FirefoxDriver(); 
//	       driver.get("http://den00pug.us.oracle.com/apps/login.aspx?ReturnUrl=%2fapps%2fExelixis_XL184-312%2fSite%2fManageSites.aspx%3fMenuId%3d4eb05563-3dbb-4c19-9780-b3d466dcb106&MenuId=4eb05563-3dbb-4c19-9780-b3d466dcb106");
//	       
//	       driver.findElement(By.xpath("//input[@id='userID']")).sendKeys("804484");
//	       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Okkadu@72");
//	       driver.findElement(By.xpath("//input[@id='Submit']")).click();
//	       
//	       Thread.sleep(3000);
	//	System.out.println("hai");
	//}
	
	@Test(priority=1,groups ="functionalTest")
	public void ahomePageTest() {
//		driver.findElement(By.xpath("//img[@title='Home']")).click();
//		
//		
//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/div[5]/div[1]/span[1]/a[1]/span[1]"));
//		String st=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/div[5]/div[1]/span[1]/a[1]/span[1]")).getAttribute("innerHTML");
//		System.out.println(st);
//		Assert.assertEquals(st, "Task Alerts");
		Assert.assertEquals("st", "st");
	}
	
	@Test(priority=1,groups ="functionalTest")
	public void bhomePageTitleTest() {
		//Assert.assertEquals(driver.getTitle(), "Oracle IRT - Exelixis XL184-312");
		Assert.assertEquals("st", "st");
	}
	
	@Test(priority=1,groups ="functionalTest")
	public void csubjectPageTest() {
		
//		driver.findElement(By.xpath("//img[@title='Subjects']")).click();
//		WebElement we=driver.findElement(By.xpath("//span[contains(text(),'Subject Transactions')]"));
//	  String st2=we.getAttribute("innerHTML");
//	  Assert.assertEquals(st2, "Subject Transactions");
		Assert.assertEquals("st1", "st");
	}
	
	@Test
	public void dsampleTest() {
		Assert.assertEquals(1,0);
	}
	
	@Test
	public void empleTest2() {
		Assert.assertEquals(1,1);
	}
	
//	@AfterMethod()
//	public void toQuit() {
//		//driver.quit();
//		System.out.println("bye");
//	}

}
