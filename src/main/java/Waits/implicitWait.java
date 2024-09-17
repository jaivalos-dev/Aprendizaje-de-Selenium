package Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class implicitWait {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

        driver.get("https://demoqa.com/dynamic-properties");

        try{
            WebElement button = driver.findElement(By.id("visibleAfter"));
            button.click();
            System.out.println("Boton presionado");
        } catch (Exception e) {
            System.out.println(e);
        }

        driver.close();

    }

}
