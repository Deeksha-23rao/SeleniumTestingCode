package sampletesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchOnetrustWebpage {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","F:/SeleniumLearning/ChromeDriver/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://onetrust.com/");
			driver.manage().window().maximize();
			WebElement contact =driver.findElement(By.xpath("//*[@id='menu-item-1934']/a"));
			contact.click();
			WebElement FirstName=driver.findElement(By.id("input-1"));
			FirstName.sendKeys("Deeksha");
			WebElement LastName=driver.findElement(By.id("input-2"));
			LastName.sendKeys("Rao");
	        WebElement email=driver.findElement(By.id("input-3"));
	        email.sendKeys("deeksha.ath@gmail.com");
	        WebElement CompanyName=driver.findElement(By.id("input-5"));
	        CompanyName.sendKeys("OnetrustAutomation");
	        WebElement PhoneNo=driver.findElement(By.id("input-4"));
	        PhoneNo.sendKeys("8861680454");
	        WebElement commentsection=driver.findElement(By.id("00N3600000LNxBv"));
	        commentsection.sendKeys("Hello");
	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        //The below method will save the screen shot in d drive with name "screenshot.png"
	           try {
				FileUtils.copyFile(scrFile, new File("F:/SeleniumLearning/Screenshot/screenshot.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	           
	           driver.close();
	          
	}
		
	}	


