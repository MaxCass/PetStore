package StorePetou.StorePetou;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestPetou {
	
	
	WebDriver driver;
	
	@Before
	public void setup() {
		
		if(System.getProperty("navigateur").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Formation\\Desktop\\Documents\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:8082/jpetstore");
		}
		else if(System.getProperty("navigateur").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Formation\\Desktop\\Documents\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:8082/jpetstore");
		}	
	}
	
	@Test
	public void testDuPetou() {
		
		driver.findElement(By.linkText("Enter the Store")).click();
		driver.findElement(By.id("MainImage")).isDisplayed();
		
	}
	
	@After
	public void teardown() {
		
		driver.quit();
		
	}
}

