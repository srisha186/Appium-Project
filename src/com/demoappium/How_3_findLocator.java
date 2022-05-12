package com.demoappium;

import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class How_3_findLocator extends Baseclass {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=Capabilitiesmethod();
		
		//id, className, xPath, AndroidUIautomator 
		
		//find element using xpath
		// syntax for xpath   //tagName[@attribute='value']
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		
		//find element using xpath
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		
		//find element using ID
		driver.findElementById("android:id/checkbox").click();
		
		//find Element using xpath with index
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("Hello busyQA");
		
		
		//find Element when you have duplicate elements with same name
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		
	
	}

	
}
