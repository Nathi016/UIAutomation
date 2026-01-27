package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {
    public static String loginButton_xpath = "/html/body/header/div/div/div/div[2]/div/ul/li[4]/a";

    public static void clickLoginButton() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath(loginButton_xpath)).click();



    }


}
