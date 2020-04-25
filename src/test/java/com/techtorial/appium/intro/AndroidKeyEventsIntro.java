package com.techtorial.appium.intro;

import com.techtorial.appium.utils.AndroidDriverUtil;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
public class AndroidKeyEventsIntro {
    AndroidDriver <AndroidElement> driver;
    @Before
    public void setUp() throws MalformedURLException {
      DesiredCapabilities caps= AndroidDriverUtil.setDesiredCapabilities("ApiDemos-debug");
      driver=AndroidDriverUtil.getAndroidDriver(caps);
    }

    @Test
    public void keys(){
        TouchAction touchAction=new TouchAction(driver);
        AndroidElement views=  driver.findElementByAndroidUIAutomator("text(\"Views\")");
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(views))).perform();
        AndroidElement dateWidgets= driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")");
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(dateWidgets))).perform();
        AndroidElement inline=  driver.findElement(By.xpath("//android.widget.TextView[@content-desc='2. Inline']"));
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(inline))).perform();

        driver.pressKey(new KeyEvent(AndroidKey.BACK));

        driver.pressKey(new KeyEvent(AndroidKey.HOME));
    }


}
