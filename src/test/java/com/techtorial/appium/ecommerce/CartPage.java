package com.techtorial.appium.ecommerce;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public CartPage(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnProceed")
    public AndroidElement website;

}
