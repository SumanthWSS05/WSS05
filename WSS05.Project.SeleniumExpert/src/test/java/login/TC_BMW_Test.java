package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_BMW_Test {

	@Test(groups = "watch")
	public void explore() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bmw.in/en/index.html");
		Thread.sleep(1000);
		driver.quit();
	}
}
