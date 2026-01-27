package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class LogIn extends BrowserDriver {

public static String emailXpath = "/html/body/section/div/div/div[1]/div/form/input[2]";
public static String passwordxpath = "/html/body/section/div/div/div[1]/div/form/input[3]";
public static String logInButtonXpath = "/html/body/section/div/div/div[1]/div/form/button";
public static String errormessageXpath = "/html/body/section/div/div/div[1]/div/form/p";
public static String signupButtonXpath ="/html/body/section/div/div/div[3]/div/form/button";

public static void sendkeys_email(){
    driver.findElement(By.xpath(emailXpath)).sendKeys("h@gmail.com");

}
public static void sendKeys_password(){
    driver.findElement(By.xpath(passwordxpath)).sendKeys("1234");
}
public static void click_loginButton(){
    driver.findElement(By.xpath(logInButtonXpath)).click();
}
public static void verify_error_message(){
    driver.findElement(By.xpath(errormessageXpath)).isDisplayed();
}
public static void signupButtonExist(){
    driver.findElement(By.xpath(signupButtonXpath)).isDisplayed();
}
}
