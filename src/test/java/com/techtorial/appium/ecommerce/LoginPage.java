package com.techtorial.appium.ecommerce;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {

    public LoginPage(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
    AndroidElement country;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
    AndroidElement username;
    @AndroidFindBy(uiAutomator = "text(\"Female\")")
    AndroidElement gender;
   @AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    AndroidElement shopBtn;


    @AndroidFindBy(uiAutomator ="text(\"Algeria\")" )
 public    AndroidElement algeria;
    @AndroidFindBy(uiAutomator ="new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bolivia\"));" )
   public AndroidElement bolivia;
    @AndroidFindBy(xpath = "//android.widget.Toast")
    public AndroidElement toastMessage;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Air Jordan 9 Retro')")
    public AndroidElement jordan;
    @AndroidFindBy(uiAutomator = "text(\"ADD TO CART\")")
    public AndroidElement AadToCart;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
    public AndroidElement cart;
    @AndroidFindBy(id= "com.androidsample.generalstore:id/productName"
    )public List<AndroidElement> listOfShoes;


}
