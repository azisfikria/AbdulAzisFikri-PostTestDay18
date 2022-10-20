package com.abdulazisposeightteen.pageobject.pages;

import com.abdulazisposeightteen.pageobject.drivers.DriverSingleton;
import com.abdulazisposeightteen.pageobject.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToWishlist {
    private WebDriver driver;
    int detik = 1;


    public AddToWishlist() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//*[@id=\"product-1394\"]/div[1]/div[2]/div[2]/div")
    WebElement btnWishlistProductJeans;

    @FindBy (xpath = "//*[@id=\"product-1377\"]/div[1]/div[2]/div[2]/div/a")
    WebElement btnWishtlistProductCoat;

    @FindBy (xpath = "//a[normalize-space()='My Wishlist']")
    WebElement btnMyWishlist;

    @FindBy (xpath = "//h1[@class='page-title']")
    WebElement txtMyWishlistPage;

    public void btnAddToWishlistJeans(){
        delay(Constants.DETIK);
        btnWishlistProductJeans.click();
        System.out.println("Jeans Product Added to Wishlist");
        delay(4);
    }
    public void btnAddToWishlistCoat(){
        delay(Constants.DETIK);
        btnWishtlistProductCoat.click();
        System.out.println("Coat Product Added to Wishlist");
        delay(4);
    }
    public void AddToWishlistBtn(){
        btnMyWishlist.click();
        System.out.println("MyWishlist Button Clicked");
        delay(Constants.DETIK);
    }
    public String getTxtMyWishlistPage(){
        return txtMyWishlistPage.getText();
    }
    static void delay(int detik) {
        //delay
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
