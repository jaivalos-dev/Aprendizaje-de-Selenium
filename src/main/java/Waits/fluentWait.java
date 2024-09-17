package Waits;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;
import java.util.function.Function;

public class fluentWait {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class);

        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();

        try{
            WebElement button = wait.until(new Function<WebDriver, WebElement>() {
                public WebElement apply(WebDriver driver) {
                    return driver.findElement(By.id("visibleAfter"));
                }
            });

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);

            //Esperar 2 segundos antes de hacer el click (Esto con fines puramente visuales)
            Thread.sleep(2000);
            button.click();
            System.out.println("Boton presionado");

        } catch (Exception e) {
            System.out.println(e);
        }

        driver.close();

    }

}
