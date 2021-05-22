package today;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestGitHub {

Webdriver = 
WebDriver driver;

public static void classBefore() {
	System.out.println("========= this is Before Class");
}

@Before
public void launchBrowser() {
	System.out.println("========= Launch Browser");

	System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	driver = new ChromeDriver();

	// go to website
	driver.get("https://techfios.com/billing/?ng=admin/");
	// maximize the window
	driver.manage().window().maximize();
	// delete the cookies
	driver.manage().deleteAllCookies();
}

@Test
public void loginTest() throws InterruptedException {
	// identify username field and pass value
	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	// identify password field and pass value
	driver.findElement(By.id("password")).sendKeys("abc123");
	// identify signin button and click
	driver.findElement(By.name("login")).click();

	// stop execution for some time
	Thread.sleep(3000);
	
driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a/span[1]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")).click();
	
	WebElement COUNTRY_DROPDOWN_LOCATOR = driver.findElement(By.xpath("//select[@id='country']"));
	Select sel = new Select(COUNTRY_DROPDOWN_LOCATOR);
	sel.selectByVisibleText("Armenia");
	

}


}
