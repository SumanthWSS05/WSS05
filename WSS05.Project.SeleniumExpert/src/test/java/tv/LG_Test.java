package tv;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LG_Test {

	@Test(groups = "tv")
	public void openLG() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lg.com/in/tvs");
		Thread.sleep(1000);
		driver.quit();
	}
}
