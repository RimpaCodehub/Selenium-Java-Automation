
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//dropdown with select tags
		//We need to provide where the dropdown preasent in the web page
      WebElement   StaticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
      //WebElement is the return type :we use WebElement as a return type when a method is supposed to find and return a single HTML element.
      Select dropdown = new Select(StaticDropdown);
      dropdown.selectByIndex(2);
      System.out.println(dropdown.getFirstSelectedOption().getText());
      dropdown.selectByContainsVisibleText("USD");
      System.out.println(dropdown.getFirstSelectedOption().getText());
      dropdown.selectByValue("INR");
      System.out.println(dropdown.getFirstSelectedOption().getText());
	}

}
