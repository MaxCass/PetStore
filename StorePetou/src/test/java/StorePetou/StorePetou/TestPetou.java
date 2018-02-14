package StorePetou.StorePetou;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class TestPetou {
	
	
	WebDriver driver;
	
	@Before
	public void setup() {
		
		if(System.getProperty("navigateur").equalsIgnoreCase("firefox")) {
			FirefoxOptions options = new FirefoxOptions().setProfile(new FirefoxProfile());
			options.addPreference("browser.tabs.remote.autostart", false);
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Formation\\Desktop\\Documents\\geckodriver.exe");
			driver = new FirefoxDriver(options);
		}
		else if(System.getProperty("navigateur").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Formation\\Desktop\\Documents\\chromedriver.exe");
			driver = new ChromeDriver();
		}	
		
		driver.manage().window().maximize();
		driver.get("http://localhost:8082/jpetstore");
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

