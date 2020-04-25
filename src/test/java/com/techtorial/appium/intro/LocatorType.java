package com.techtorial.appium.intro;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LocatorType {

    DesiredCapabilities desiredCapabilities;
    URL appiumServerUrl;
    AndroidDriver<AndroidElement> driver;
    @Before
    public   void setUp() throws MalformedURLException {
        desiredCapabilities=new DesiredCapabilities();
        File apkFile=new File("src/test/resources/ApiDemos-debug.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"ajarkin");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        desiredCapabilities.setCapability(MobileCapabilityType.APP,apkFile.getAbsolutePath());
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 300);
        appiumServerUrl =new URL("http://localhost:4723/wd/hub");
        driver=new AndroidDriver(appiumServerUrl,desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public void locators(){
//      AndroidElement accessibilityId=  driver.findElementByAccessibilityId("Accessibility");
//      accessibilityId.click();
//      AndroidElement customView=driver.findElement(By.xpath("//android.widget.TextView[@text='Custom View']"));
//      customView.click();



    }

    @Test
    public void locators2(){
      AndroidElement view=  driver.findElement(By.xpath("//android.widget.TextView[@text='Views']"));
      view.click();
 AndroidElement chronometer=  driver.findElementByAndroidUIAutomator("text(\"Chronometer\")");
chronometer.click();
    }


}
