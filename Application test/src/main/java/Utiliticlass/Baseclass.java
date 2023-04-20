package Utiliticlass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

public class Baseclass {
	public AndroidDriver driver;
	
	public void main(String[]arg) throws MalformedURLException, Exception {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 6 Pro API 31");
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
			caps.setCapability(MobileCapabilityType.UDID,"emulator-5554");
			caps.setCapability("appPackage","com.example.myapplication");
			caps.setCapability("appActivity","MainActivity");
			URL url= new URL(" http://localhost:4723/wd/hub");
			AndroidDriver driver = new AndroidDriver(url,caps);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 }
	
	}


