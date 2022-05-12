package com.demoappium;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class Gestures_Tap extends Baseclass {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver = Capabilitiesmethod();
		// Tap - mobile Gesture
		TouchAction t = new TouchAction(driver);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		WebElement expandList= driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		t.tap(tapOptions().withElement(element(expandList))).perform();
		
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		String str = driver.findElementByXPath("//android.widget.TextView[@text='Fish Names']").getText();
		System.out.println(str);
		driver.quit();
	}
}
