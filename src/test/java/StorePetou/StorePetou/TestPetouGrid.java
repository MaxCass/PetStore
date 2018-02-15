package StorePetou.StorePetou;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class TestPetouGrid {

	public RemoteWebDriver driver;
	public String URL, Node;
	
	DesiredCapabilities cap = new DesiredCapabilities();
	
	@Test
	public void Chrome() throws MalformedURLException {
		String URL = "https://fr.wikipedia.org";
		String Node = "http://localhost:4444/wd/hub";
		System.out.println(" Executing on Chrome");
		cap.setBrowserName("chrome");
		//cap.setVersion("63.0.3239.132");
		cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL(Node), cap);
		driver.navigate().to(URL);
		driver.manage().window().maximize();
		driver.findElement(By.id("searchInput")).sendKeys("Essai");
		driver.findElement(By.id("searchButton")).click();
		driver.close();
	}	
	
	@Test
	public void Firefox() throws MalformedURLException {
		String URL = "https://fr.wikipedia.org";
		System.out.println(" Executing on FireFox");
		String Node = "http://localhost:4444/wd/hub";			
		cap.setBrowserName("firefox");
		//cap.setVersion("57.0.4");
		cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL(Node), cap);
		//WebDriver driver = new FirefoxDriver();
		driver.navigate().to(URL);
		driver.manage().window().maximize();
		driver.findElement(By.id("searchInput")).sendKeys("Essai");
		driver.findElement(By.id("searchButton")).click();
		driver.close();
	}
	

	
}
