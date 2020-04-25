package com.techtorial.appium.intro;

import com.techtorial.appium.utils.AndroidDriverUtil;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.util.List;

public class SwipeAction {
    AndroidDriver driver;
    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps=AndroidDriverUtil.setDesiredCapabilities("ApiDemos-debug");
        driver=AndroidDriverUtil.getAndroidDriver(caps);

    }
    @Test
    public void swipe(){

        AndroidElement views= (AndroidElement) driver.findElementByAndroidUIAutomator("text(\"Views\")");
        TouchAction touchAction=new TouchAction(driver);
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(views))).perform();
        AndroidElement dateWidgets= (AndroidElement) driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")");
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(dateWidgets))).perform();
     AndroidElement inline= (AndroidElement) driver.findElement(By.xpath("//android.widget.TextView[@content-desc='2. Inline']"));
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(inline))).perform();

     AndroidElement five= (AndroidElement) driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='5']"));

    five.click();
        AndroidElement num15= (AndroidElement) driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='15']"));
        AndroidElement num40= (AndroidElement) driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='40']"));

        touchAction.press(ElementOption.element(num15)).moveTo(ElementOption.element(num40)).perform();
        Assert.assertTrue(num40.isSelected());
        List< AndroidElement> times=driver.findElements(By.xpath("//android.widget.TextView"));
        String finalTime="";
        for(AndroidElement element: times){
            finalTime+=element.getText();
        }
Assert.assertTrue(finalTime.contains("5:40"));
    }

}
