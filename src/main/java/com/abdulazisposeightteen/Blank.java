package com.abdulazisposeightteen;

import com.abdulazisposeightteen.pageobject.drivers.DriverSingleton;
import com.abdulazisposeightteen.pageobject.utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Blank {
    public static void main(String[] args) {
        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);


        driver.findElement(By.xpath("//a[.='Dismiss']")).click();
        System.out.println("Dismiss clicked");
        driver.findElement(By.xpath("//a[@class='noo-search']")).click();
        driver.findElement(By.xpath("//input[@name='s']")).sendKeys("jeans");
        driver.findElement(By.xpath("//input[@name='s']")).sendKeys(Keys.ENTER);
        driver.findElement((By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[3]/div/h3/a"))).click();
        driver.findElement((By.xpath("//*[@id=\"product-1394\"]/div[1]/div[2]/div[2]/div/a"))).click();
        delay(2);
        driver.findElement((By.xpath("//a[normalize-space()='My Wishlist']"))).click();
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
