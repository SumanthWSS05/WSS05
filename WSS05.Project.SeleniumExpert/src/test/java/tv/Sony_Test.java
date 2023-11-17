package tv;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sony_Test {

	@Test(groups = "tv")
	public void openSony() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sony.co.in/bravia");
		Thread.sleep(1000);
		driver.quit();
	}
}
