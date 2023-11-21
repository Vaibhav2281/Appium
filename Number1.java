package Mobile.Assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Number1 {
	
	//Write an Appium Program to connect with emulator and open APIdemo.app application on your emulator
	
	public AndroidDriver driver;
	@Test
	public void test() throws MalformedURLException, InterruptedException {
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Nexus 5X");
		options.setApp("D:\\apk file\\ApiDemos-debug.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(6000);
		
		driver.quit();
		
	}

}
