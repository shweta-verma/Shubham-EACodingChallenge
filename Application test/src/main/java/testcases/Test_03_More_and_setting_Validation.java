package testcases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import Utiliticlass.Baseclass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test_03_More_and_setting_Validation{

	public static void main(String[] args) throws MalformedURLException, Exception {
		
		//Desired capabilities to launch the Application in the on emulator 
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
	
		//click on next button 
		driver.findElement(By.id("com.example.myapplication:id/button_first")).click();

		// click More button()
		driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"More options\"]").click();

		// clickSettingbutton()

		driver.findElementByXPath("//*[@text=\"Settings\"]").click();

	}

}