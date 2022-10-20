package com.abdulazisposeightteen;

import com.abdulazisposeightteen.pageobject.drivers.DriverSingleton;
import com.abdulazisposeightteen.pageobject.pages.AddToWishlist;
import com.abdulazisposeightteen.pageobject.utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAddToWishlist {
    public static WebDriver driver;
    private AddToWishlist addToWishlist;

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);
        driver.findElement(By.xpath("//a[.='Dismiss']")).click();
        System.out.println("Dismiss Button Clicked");
    }

    @BeforeMethod
    public void pageObject(){
        addToWishlist = new AddToWishlist();
    }

    @Test
    public void testMyWishlistPage(){
        addToWishlist.AddToWishlistBtn();
        Assert.assertEquals(addToWishlist.getTxtMyWishlistPage(), "WISHLIST");
        System.out.println();
//        Assert.assertEquals();
    }
    @AfterClass
    public void closeBrowser() {
        delay(3);
        driver.quit();
    }
    static void delay(int detik) {
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
