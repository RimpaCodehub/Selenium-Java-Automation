import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorrahulsheetyacademy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				WebDriver r = new ChromeDriver();
				r.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				r.get("https://rahulshettyacademy.com/locatorspractice/"); //To launch the browser
				r.findElement(By.id("inputUsername")).sendKeys("rahul"); // to put the username automatically
				r.findElement(By.name("inputPassword")).sendKeys("2021");
				r.findElement(By.className("signInBtn")).click();// To click on Sign In button
				//CSS Selector : Syntax : If class name is present : Class name -> tagname.classname
				                //   If ID is there then Syntax : tagname#id
				                // If class and Id is not there then generic syntax : tagname[attribute='value']
				System.out.println(r.findElement(By.cssSelector("p.error")).getText());
				//Above line bring error as there is time synchronized issue. Selenium is searching the error after clicking on Sign in button but in system after 2sec error is reflect so time synchronization is getting mismatched
				// To resolve this issue we will go for implicit wait - 5second time out : line 13 in code. Note : We need to provide this code after object is created
				r.findElement(By.linkText("Forgot your password?")).click();//When we need to click on link we use it
				Thread.sleep(2000);  // to handle the line 33 error. Here in java we use thread for pause
				r.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rimpa");
				r.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rimpa01bhakat@gmail.com");
				r.findElement(By.cssSelector("input[placeholder='Email']")).clear(); //To clear the input given in textfield
				r.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("rimpa4bhakat@gmail.com");
				r.findElement(By.xpath("//form/input[3]")).sendKeys("8622971825");   //Xpath using tagname from parent to child
				r.findElement(By.cssSelector(".reset-pwd-btn")).click();
				System.out.println(r.findElement(By.cssSelector("form p")).getText()); // This is for parent to child, to print the error msg. this line give exception error
				r.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
				Thread.sleep(2000);
				r.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");  //when value some part is static and some are dynamic
				r.findElement(By.cssSelector("input[type*='pass'")).sendKeys("rahulshettyacademy"); //css general
				r.findElement(By.id("chkboxOne")).click();
				r.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
				//div[@class='forgot-pwd-btn-conainer']/button[1]      : This is a xpath for parent to child
	}

}
