package Mobile.Assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Number6 {

	@Test
	public void scroll() throws MalformedURLException, InterruptedException {
		
		//Write an Appium Program to connect with realdevice using APIDemo.app to perform scrolling the all option.
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Xiaomi Redmi K20 Pro");
		cap.setCapability("udid","501488a7");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11.0");
		cap.setCapability( "appPackage","io.appium.android.apis");
		cap.setCapability("appActivity","io.appium.android.apis.ApiDemos");
		cap.setCapability("automationName", "UIAutomator2");
		
		URL url = new URL("http://127.0.0.1:4723/");
		AppiumDriver driver = new AppiumDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(3000);
		
		driver.findElement(AppiumBy.androidUIAutomator
				("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
