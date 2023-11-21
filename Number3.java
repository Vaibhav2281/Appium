package Mobile.Assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Number3 {

	public AndroidDriver driver;
	@Test
	public void test1() throws MalformedURLException, InterruptedException {
		
		//Write an Appium Program to connect with emulator wit ecommerce based application using 
		//Generalstore.app to perform locators like name, dropdown etc.
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Nexus 5X");
		options.setApp("D:\\apk file\\General-Store.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Vaibhav");
		Thread.sleep(2000);
		driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElement(AppiumBy.androidUIAutomator
				("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(5000);
		
		driver.quit();
	}
}
