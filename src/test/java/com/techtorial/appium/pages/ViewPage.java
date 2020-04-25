package com.techtorial.appium.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ViewPage {

    public ViewPage(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),ViewPage.class);

    }
}
