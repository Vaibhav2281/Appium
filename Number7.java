package Mobile.Assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class Number7 {

	@Test
	public void calculator() throws MalformedURLException, InterruptedException {
		
		//Write an Appium Program to connect with realdevice using APIDemo.app to open the calculator 
		//and calculate all the operation like (addition, substraction, multiplication, division).
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Xiaomi Redmi K20 Pro");
		cap.setCapability("udid","501488a7");  
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11.0");
		cap.setCapability( "appPackage","com.dencreak.dlcalculator"); 
		cap.setCapability("appActivity","com.dencreak.dlcalculator.DLCalculatorActivity"); 
		cap.setCapability("automationName", "UIAutomator2");

		URL url = new URL("http://127.0.0.1:4723/");
		
		AppiumDriver driver = new AppiumDriver(url, cap);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_d_d")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_c_a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click();
		Thread.sleep(2000);
		String str = driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val")).getText();
		
		System.out.println("The answer is:" + str );
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_back")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_c_d")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_c_a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click();
		Thread.sleep(2000);
		String str1 = driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val")).getText();
		
		System.out.println("The answer is:" + str1 );
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_back")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_b_d")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_c_a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click();
		Thread.sleep(2000);
		String str2 = driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val")).getText();
		
		System.out.println("The answer is:" + str2 );
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_back")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_a_d")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_c_a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click();
		Thread.sleep(2000);
		String str3 = driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val")).getText();
		
		System.out.println("The answer is:" + str3 );
		Thread.sleep(2000);
		
		driver.quit();
	}
}
