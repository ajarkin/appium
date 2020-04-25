package com.techtorial.appium.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class apiDemosMainPage {
    public apiDemosMainPage(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);


    }

    @AndroidFindBy(accessibility = "Preference")
    AndroidElement preference;

    @AndroidFindBy(id = "Accessibility")
    AndroidElement accessibility;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Animation']")
    AndroidElement animation;

    @AndroidFindBy(uiAutomator = "text(\"Content\")")
    AndroidElement content;





}
