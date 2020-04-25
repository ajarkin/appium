package com.techtorial.appium.utils;

        import io.appium.java_client.android.AndroidDriver;
        import io.appium.java_client.android.AndroidElement;
        import io.appium.java_client.remote.AutomationName;
        import io.appium.java_client.remote.MobileCapabilityType;
        import org.openqa.selenium.Platform;
        import org.openqa.selenium.remote.DesiredCapabilities;

        import java.io.File;
        import java.net.MalformedURLException;
        import java.net.URL;
        import java.util.concurrent.TimeUnit;

public class AndroidDriverUtil {

    /*

    public static AndroidDriver getAndroidDriver(DesiredCapabilities caps) throws MalformedURLException {
        URL appiumServerUrl=new URL("http://localhost:4723/wd/hub");
        AndroidDriver<AndroidElement>driver = new AndroidDriver(appiumServerUrl,caps);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

     */
    public static AndroidDriver getAndroidDriver(DesiredCapabilities caps) throws MalformedURLException {
        URL appiumServerUrl = new URL("http://localhost:4723/wd/hub");
        AndroidDriver<AndroidElement> driver = new AndroidDriver(appiumServerUrl, caps);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

    public static DesiredCapabilities setDesiredCapabilities(String appName) {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        File apkFile = new File("src/test/resources/"+appName+".apk");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "ajarkin");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        desiredCapabilities.setCapability(MobileCapabilityType.APP, apkFile.getAbsolutePath());
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 300);
        return desiredCapabilities;
    }


}
