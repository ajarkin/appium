package com.techtorial.appium.ecommerce;

import com.techtorial.appium.utils.AndroidDriverUtil;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Set;

public class EcommerceIntro {

    AndroidDriver<AndroidElement> driver;

    @Before
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = AndroidDriverUtil.setDesiredCapabilities("ecommerceApp");
        driver = AndroidDriverUtil.getAndroidDriver(caps);
    }

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
       // loginPage.country.click();
       // loginPage.bolivia.click();
        loginPage.gender.click();
        loginPage.username.click();
          loginPage.username.sendKeys("ajara");
        if (driver.isKeyboardShown()) {
            driver.hideKeyboard();
        }
        loginPage.shopBtn.click();

    }

    @Test
    public void loginTestNegative() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.shopBtn.click();
        String message=loginPage.toastMessage.getAttribute("name");
        Assert.assertEquals("Please enter your name",message);

    }

    @Test
    public void jordan(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.username.sendKeys("ajara");
        loginPage.shopBtn.click();

     AndroidElement jordanShoes=   driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 9 Retro\"));");
        loginPage.AadToCart.click();
        loginPage.cart.click();
        AndroidElement terms=driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
AndroidElement termsOfCond=driver.findElementByAndroidUIAutomator("text(\"\tTerms Of Conditions\")");

        TouchAction touchAction = new TouchAction(driver);
        touchAction.longPress(LongPressOptions.longPressOptions()
                .withDuration(Duration.ofSeconds(2)).withElement(ElementOption.element(terms))).perform();

Assert.assertTrue(termsOfCond.isDisplayed());


    }


    @Test
    public void test() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        CartPage cartPage=new CartPage(driver);
        loginPage.username.sendKeys("ajara");
        loginPage.shopBtn.click();
        loginPage.AadToCart.click();
        loginPage.cart.click();


        Set<String> contextHandles=driver.getContextHandles();
        System.out.println(contextHandles);

        cartPage.website.click();
        Thread.sleep(3000);
        Set<String> contextHandles1=driver.getContextHandles();
        System.out.println(contextHandles1);

    }

}