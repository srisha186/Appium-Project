package com.demoappium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class How_0_example1 {
	
	@Test
	public void setUp() throws MalformedURLException {
		
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel4");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		
		
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome"); 
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<AndroidElement>  driver=new AndroidDriver<AndroidElement> (url, cap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");

	}

}
