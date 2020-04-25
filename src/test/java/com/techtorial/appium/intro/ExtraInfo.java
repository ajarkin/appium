package com.techtorial.appium.intro;

import com.techtorial.appium.utils.AndroidDriverUtil;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

public class ExtraInfo {
    AndroidDriver<AndroidElement> driver;
@Test
    public void getInfo() throws MalformedURLException {
        DesiredCapabilities caps= AndroidDriverUtil.setDesiredCapabilities("ApiDemos-debug.apk");
        driver=AndroidDriverUtil.getAndroidDriver(caps);
        System.out.println(driver.getContext());
        System.out.println(driver.getBatteryInfo().getState());
        System.out.println(driver.getOrientation());
        System.out.println(driver.isDeviceLocked());
        System.out.println(driver.isKeyboardShown());
        System.out.println(driver.isBrowser());

    }
}
