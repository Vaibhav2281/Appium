package Mobile.Assignment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class Number2 {
	@Test
	public void test() throws MalformedURLException {
		
		//Write an Appium Program to connect with Realdevice and open APIdemo.app application on your realdevice.
		
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
		driver.quit();
	}
}
