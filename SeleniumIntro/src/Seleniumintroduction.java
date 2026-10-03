import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumintroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome - ChromeDriver ->>Methods
		//webdriver methods + class method
		
		//Invoke chromedriver.exe--> Chrome browser
		//step to invoke chroe driver
		WebDriver driver = new ChromeDriver();
		
		//Firefox Launch
		//geckodriver
		//webdriver.gecko.driver
		//System.setProperty("webdriver.gecko.driver", "/Users/rimpa/Documents/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//Edge
		//WebDriver driver = new EdgeDriver();
		//System.setProperty("Webdriver.edge.driver", "/Users/rimpa/Documents/edgedriver_win64 (1)/msedgedriver.exe");
		
		//When any company have restriction for using selenium manager then we download the chromedriver.exe from browser or link https://sites.google.com/chromium.org/driver/downloads
		//System.setProperty("webdriver.chrome.driver", "/Users/rimpa/Downloads/chromedriver.exe");
		//Selenium Manager
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.itoursdemo.co.in/demo-4/crm/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
	}

}
