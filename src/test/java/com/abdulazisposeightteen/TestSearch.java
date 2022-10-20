package com.abdulazisposeightteen;

import com.abdulazisposeightteen.pageobject.drivers.DriverSingleton;
import com.abdulazisposeightteen.pageobject.pages.Search;
import com.abdulazisposeightteen.pageobject.utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSearch {
    public static WebDriver driver;
    private Search search;

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
        search = new Search();
    }

    @Test
    public void testSearchPage(){
        delay(Constants.DETIK);
        search.Search();
        Assert.assertEquals(search.getTxtSearchPage(),"TYPE AND PRESS ENTER TO SEARCH");
        System.out.println("test case search page");
    }

    @AfterClass
    public void closeBrowser() {
        delay(3);
        DriverSingleton.closeObjectInstance();
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
