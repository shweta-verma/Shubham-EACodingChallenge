package testsuit;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import testcases.Test_01_Nextbuttonvalidation;
import testcases.Test_02_PreviousButtonValidation;
import testcases.Test_03_More_and_setting_Validation;
import testcases.test_04_Massage_Icon_validation;
//If you want to execute all test cases as test suit we will used this test suit class  
public class Testsuit {
	AndroidDriver driver;
	//Test01_ click on the next button
	@Test(priority=1)
	public void Testcase1() {

		driver.findElement(By.id("com.example.myapplication:id/button_first")).click();	
	}

	//Test02_ click on the Previous button
	@Test(priority=2)
	public void Testcase2() {
		driver.findElement(By.id("com.example.myapplication:id/button_second")).click();

	}

	//Test03_ click on the more & setting  
	@Test(priority=3)
	
	public void Testcase3() throws Exception {

		driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"More options\"]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@text=\"Settings\"]").click();

	}

	//Test04_ click on the Massage icon 
	@Test(priority=4)
	public void Testcase4() {

		driver.findElement(By.id("com.example.myapplication:id/fab")).click();	
	}
	
	
	// Desired Capability to launch the application 
	@BeforeTest
	public void beforeClass() throws Exception{
		DesiredCapabilities caps = new DesiredCapabilities();
		File app = new File("C:\\Users\\2195178\\eclipse-workspace\\Base\\APK");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 6 Pro API 31");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		caps.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		caps.setCapability("appPackage","com.example.myapplication");
		caps.setCapability("appActivity","MainActivity");
		URL url= new URL(" http://localhost:4723/wd/hub");
		driver = new AndroidDriver(url,caps);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@AfterClass()
	public void afterclass()
	{
		driver.quit();
	}

}

















