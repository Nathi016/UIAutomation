package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class LogIn extends BrowserDriver {

public static String emailXpath = "//input[@data-qa='login-email']";
public static String passwordxpath = "//input[@type='password']";
public static String logInButtonXpath = "//button[@data-qa='login-button']";
public static String errormessageXpath = "Your email or password is incorrect!";
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
    driver.findElement(By.linkText(errormessageXpath)).isDisplayed();
}
public static void signupButtonExist(){
    driver.findElement(By.xpath(signupButtonXpath)).isDisplayed();
}
}
