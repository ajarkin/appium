package com.techtorial.appium.intro;

import com.techtorial.appium.utils.AndroidDriverUtil;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Gestures {


    DesiredCapabilities desiredCapabilities;
    URL appiumServerUrl;
    AndroidDriver<AndroidElement> driver;

    @Before
    public   void setUp() throws MalformedURLException {
        DesiredCapabilities caps=AndroidDriverUtil.setDesiredCapabilities("ApiDemos-debug");
        driver=  AndroidDriverUtil.getAndroidDriver(caps);

    }




    @Test
    public void tabGesture(
){
//
//AndroidElement media=driver.findElementByAndroidUIAutomator("text(\"Media\")");
//media.click();

       // touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(media))).perform();

        TouchAction touchAction=new TouchAction(driver);

       AndroidElement views=driver.findElementByAndroidUIAutomator("text(\"Views\")");
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(views))).perform();
        AndroidElement expandable=driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");

        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(expandable))).perform();


        AndroidElement customAdapter=driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")");

        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(customAdapter))).perform();
        AndroidElement catNames=driver.findElement(By.xpath("//android.widget.TextView[@text='Cat Names']"));
        Assert.assertEquals("Cat Names",catNames.getText());



}

@Test
    public void longPress(){
    TouchAction touchAction=new TouchAction(driver);

    AndroidElement views=driver.findElementByAndroidUIAutomator("text(\"Views\")");
    touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(views))).perform();
    AndroidElement expandable=driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
    touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(expandable))).perform();
    AndroidElement customAdapter=driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")");
    touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(customAdapter))).perform();
    AndroidElement peopleNames=driver.findElementByAndroidUIAutomator("text(\"People Names\")");
touchAction.longPress(LongPressOptions.longPressOptions().
        withDuration(Duration.ofSeconds(2)).withElement(ElementOption.element(peopleNames))).perform();

AndroidElement sampleMenu=driver.findElementByAndroidUIAutomator("text(\"Sample menu\")");
Assert.assertTrue(sampleMenu.isDisplayed());



}

@Test
    public void longPress1(){
    TouchAction touchAction=new TouchAction(driver);

    AndroidElement views=driver.findElementByAndroidUIAutomator("text(\"Views\")");
    touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(views))).perform();
    AndroidElement expandable=driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
    touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(expandable))).perform();
    AndroidElement customAdapter=driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")");
    touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(customAdapter))).perform();
    AndroidElement peopleNames=driver.findElementByAndroidUIAutomator("text(\"People Names\")");

    AndroidElement fishNames=driver.findElementByAndroidUIAutomator("text(\"Fish Names\")");
    touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(fishNames))).perform();

    List< AndroidElement> fishes=new ArrayList<>();
    AndroidElement bubbles=driver.findElementByAndroidUIAutomator("text(\"Bubbles\")");
    AndroidElement goldy=driver.findElementByAndroidUIAutomator("text(\"Goldy\")");
    fishes.add(bubbles);
    fishes.add(goldy);
    for(AndroidElement element: fishes){
        Assert.assertTrue(element.isDisplayed());

    }


}


}
