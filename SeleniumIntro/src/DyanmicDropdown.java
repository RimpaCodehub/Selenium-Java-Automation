import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanmicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
         //  //a[@value='MAA']   - xpath for chennai
		//a[@value='BLR']   - xpath for Bangaluru
		//(//a[@value='MAA'])[2]   - xpath for CHENNAI of To dropdown
		//If we use above xpath then as it is a dyanamic dropdown From and To location have same option
		// to tell selenium where dropdown select what option we need to use index value but only for To dropdown as 
		//as selenium scan from top left
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	}

}
