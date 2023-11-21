package Mobile.Assignment;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Number5 extends basetest{

	@Test
	public void lp() throws MalformedURLException, InterruptedException {
		
	//Write an Appium Program to connect with realdevice using APIDemo.app to perform longpress to open to side menu.
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Xiaomi Redmi K20 Pro");
		cap.setCapability("udid","501488a7");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11.0");
		cap.setCapability( "appPackage","io.appium.android.apis");
		cap.setCapability("appActivity","io.appium.android.apis.ApiDemos");
		cap.setCapability("automationName", "UIAutomator2");
		
		URL url = new URL("http://127.0.0.1:4723/");
		driver = new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(3000);
		
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		Thread.sleep(3000);
		
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		Thread.sleep(3000);
		
		WebElement a1 = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		longPressAction(a1);
		String msg = driver.findElement(By.id("android:id/title")).getText();
		
		assertEquals(msg, "Sample menu");
	}
}
