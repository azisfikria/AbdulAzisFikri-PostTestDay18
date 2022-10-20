package com.abdulazisposeightteen.pageobject;

import com.abdulazisposeightteen.pageobject.drivers.DriverSingleton;
import com.abdulazisposeightteen.pageobject.pages.AddToWishlist;
import com.abdulazisposeightteen.pageobject.pages.Search;
import com.abdulazisposeightteen.pageobject.utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainApp {
    public static void main(String[] args) {
        int detik = 1;

        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);
        delay(detik);
        driver.findElement(By.xpath("//a[.='Dismiss']")).click();
        System.out.println("Dismiss Button Clicked");

        Search search = new Search();
        AddToWishlist addToWishlist = new AddToWishlist();
        search.Search();
        search.selectProductOne();
        addToWishlist.btnAddToWishlistJeans();
        delay(Constants.DETIK);
        driver.navigate().back();
        System.out.println("navigate back");
        search.Search();;
        search.selectProductTwo();
        addToWishlist.btnAddToWishlistCoat();
        delay(Constants.DETIK);
        driver.navigate().back();
        System.out.println("navigate back");
        addToWishlist.AddToWishlistBtn();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
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
