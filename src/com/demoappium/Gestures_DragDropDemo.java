package com.demoappium;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gestures_DragDropDemo extends Baseclass{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//Runtime.getRuntime().exec("cmd /c start c:\\startappium.bat");
		//Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 127.0.0.1 -p 4723\"");
	
		Thread.sleep(8000);
		AndroidDriver<AndroidElement> driver=Capabilitiesmethod();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	     driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
	     TouchAction t = new TouchAction(driver);
	     WebElement source=driver.findElementsByClassName("android.view.View").get(0);
	     WebElement destination=driver.findElementsByClassName("android.view.View").get(1);
	     t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
	     driver.quit();	
	}

}
