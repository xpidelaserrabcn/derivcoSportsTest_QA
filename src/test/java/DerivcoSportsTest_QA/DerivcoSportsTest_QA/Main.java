package DerivcoSportsTest_QA.DerivcoSportsTest_QA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the text you want to search:");
		String searchText = System.console().readLine();
		System.out.println("Enter the Nth reult you want to open:");
		int nth = Integer.parseInt(System.console().readLine());
		System.out.println("Enter the chrome driver path for selenium:");
		String chromeDriverPath = System.console().readLine();
		
		//Set up the driver
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		
		//Navigate to Google
		driver.navigate().to("http://google.com");
		
		//Find the search input element, enter the text and press enter
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys(searchText);
		search.sendKeys(Keys.RETURN);
		
		//Find all the results and click on the nth
		List<WebElement> results = driver.findElements(By.xpath("//div[@class=\"r\"]/a/h3"));
		results.get(nth).click();
	}

}
