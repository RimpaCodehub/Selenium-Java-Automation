import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.*;

public class Locatorrahul2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "rahul";
		WebDriver r = new ChromeDriver();
		r.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getpassword(r);
		r.get("https://rahulshettyacademy.com/locatorspractice/"); //To launch the browser
		r.findElement(By.id("inputUsername")).sendKeys(name); // to put the username automatically
		r.findElement(By.name("inputPassword")).sendKeys(password);
		r.findElement(By.className("signInBtn")).click();// To click on Sign In button
		Thread.sleep(2000);
		System.out.println(r.findElement(By.tagName("p")).getText());
		Assert.assertEquals(r.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(r.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		r.findElement(By.xpath("//*[text()='Log Out']")).click(); // In xpath in the place of tagname we can use star(*) also
		r.close();
	}
	// To handle the password dynamically we are using another method
	public static String getpassword(WebDriver r) throws InterruptedException // WebDRiver r we passed in this method to use that object in our code
	{
		r.get("https://rahulshettyacademy.com/locatorspractice/"); //To launch the browser
		r.findElement(By.linkText("Forgot your password?")).click();//When we need to click on link we use it
		Thread.sleep(2000);
		r.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = r.findElement(By.cssSelector("form p")).getText(); // This is for parent to child, to print the error msg. this line give exception error
		//passwordText store : Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordText.split("'"); // split method basically split the sentence by it
		//oth index - Plesae use temporary password
		//1st index - rahulshettyacademy' to loging
		String password = passwordArray[1].split("'")[0]; // if we use array of index in last then it will store in string dirrectly
		return password; // So return we use to get the value to the main method 
	}

}
