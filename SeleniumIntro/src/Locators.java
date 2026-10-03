import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.xpath.internal.operations.Div;
public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver r = new ChromeDriver();
		r.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		r.get("https://www.itoursdemo.co.in/demo-4/crm/"); //To launch the browser
		r.findElement(By.id("txt_username")).sendKeys("admin"); // to put the username automatically
		r.findElement(By.name("txt_password")).sendKeys("2021");
		r.findElement(By.className("app_btn")).click();// To click on Sign In button
		//CSS Selector : Syntax : If class name is present : Class name -> tagname.classname
		                //   If ID is there then Syntax : tagname#id
		                // If class and Id is not there then generic syntax : tagname[attribute='value']
		System.out.println(r.findElement(By.cssSelector("div.Content")).getText());
		//Above line bring error as there is time synchronized issue. Selenium is searching the error after clicking on Sign in button but in system after 2sec error is reflect so time synchronization is getting mismatched
		// To resolve this issue we will go for implicit wait - 5second time out : line 13 in code. Note : We need to provide this code after object is created
		r.findElement(By.cssSelector("input#txt_username")).sendKeys("admin");  //when value some part is static and some are dynamic
		r.findElement(By.cssSelector("input[type*='pass'")).sendKeys("2025");
		
		
	    

	}

}
