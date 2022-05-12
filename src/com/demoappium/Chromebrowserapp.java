package com.demoappium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

class Chromebrowserapp {

	AndroidDriver<AndroidElement> driver;

	@BeforeMethod
	public void setup() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		// cap.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
		// cap.setCapability(MobileCapabilityType.PLATFORM_NAME,
		// MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testcase() throws MalformedURLException {
		driver.get("http://msn.com");
	}

	@AfterMethod
	public void tearDown() {
		driver.closeApp();
	}

}