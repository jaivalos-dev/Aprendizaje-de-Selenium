package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
    public static void main(String[] args){

        //Initialize the webdriver
        WebDriver driver = new ChromeDriver();

        //Opening the website
        driver.get("https://www.saucedemo.com/");

        //Maximize the web browser
        driver.manage().window().maximize();

        //Credentials
        String username = "standard_user";
        String password = "secret_sauce";

        //Locator by ID
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        //WebElement loginButton = driver.findElement(By.id("login-button"));

        //Locator by CLASS
        //WebElement loginButton = driver.findElement(By.className("submit-button"));

        //Locator by NAME
        //WebElement loginButton = driver.findElement(By.name("login-button"));

        //Locator by XPATH
        //WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));

        //Locator by CSS SELECTOR
        WebElement loginButton = driver.findElement(By.cssSelector("input.submit-button"));


        //Login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

    }
}
