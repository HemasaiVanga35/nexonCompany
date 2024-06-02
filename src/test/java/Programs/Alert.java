package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alert {
	
	public WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	//click on click me button
	  driver.findElement(By.id("alertButton")).click();
	  
	  String str = driver.switchTo().alert().getText();
	  System.out.println(str);
	  
	  Thread.sleep(3000);
	  
	  //handling alert
	  driver.switchTo().alert().accept();
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
