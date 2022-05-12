package com.demoappium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class How_4_Use_UiautomatorLocator extends Baseclass {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=Capabilitiesmethod();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Just write ("attribute (\"value\")"), no tag name required
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();   
		//How to validate Clickable feature for all options
		//driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
	
	}

	
}
