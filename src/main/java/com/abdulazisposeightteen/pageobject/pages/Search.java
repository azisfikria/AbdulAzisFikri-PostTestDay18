package com.abdulazisposeightteen.pageobject.pages;

import com.abdulazisposeightteen.pageobject.drivers.DriverSingleton;
import com.abdulazisposeightteen.pageobject.utils.Constants;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
    private WebDriver driver;
    int detik = 1;


    public Search() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    //login
    @FindBy(xpath = "//a[@class='woocommerce-store-notice__dismiss-link']")
    WebElement btnDismiss;

    @FindBy(xpath = "//a[@class='noo-search']")
    WebElement btnSearch;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[3]/div[2]/form/label")
    WebElement txtSearchPage;

    @FindBy(xpath = "//input[@name='s']")
    WebElement inpNameProduct;

    @FindBy (xpath = "//a[contains(text(),'dark blue vice high waisted slash knee skinny jean')]")
    WebElement productOne;

    @FindBy (xpath = "//a[normalize-space()='nude shaggy faux fur coat']")
    WebElement productTwo;



    public void Search (){
        delay(2);
        btnSearch.click();
        System.out.println("Button Search Clicked");
    }

    public String getTxtSearchPage(){
        return txtSearchPage.getText();
    }


    public void selectProductOne(){
        delay(Constants.DETIK);
        inpNameProduct.sendKeys("jeans", Keys.ENTER);
        System.out.println("Input Product Jeans");
        delay(Constants.DETIK);
        productOne.click();
        System.out.println("Product Jeans Clicked");
        delay(Constants.DETIK);

    }
    public void selectProductTwo(){
        delay(Constants.DETIK);
        inpNameProduct.sendKeys("coat", Keys.ENTER);
        System.out.println("Input Product Coat");
        delay(Constants.DETIK);
        productTwo.click();
        System.out.println("Product Coat Clicked");
        delay(Constants.DETIK);

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
