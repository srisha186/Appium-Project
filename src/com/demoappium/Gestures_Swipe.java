package com.demoappium;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gestures_Swipe extends Baseclass {


	public static void main(String[] args) throws InterruptedException, IOException {
	
	AndroidDriver<AndroidElement>  driver=Capabilitiesmethod();
	TouchAction t=new TouchAction(driver);
	driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
	driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
	driver.findElementByXPath("//*[@content-desc='9']").click();   //* means any tagname
	
	WebElement first=driver.findElementByXPath("//*[@content-desc='15']");
	WebElement second=driver.findElementByXPath("//*[@content-desc='45']");
	//long press on first element then 2 second hold move to 2nd element and then you release 
	t.longPress(longPressOptions().withElement(element(first)).withDuration(Duration.ofSeconds(2))).moveTo(element(second)).release().perform();
	driver.quit();
	}
}
