package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicitWait {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();

        try{
            //Esperar a que el boton sea visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));

            //Encontrar el elemento en cuestion
            WebElement button = driver.findElement(By.id("visibleAfter"));

            //Desplazar el navegador hasta el botón
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);

            //Esperar 2 segundos antes de hacer el click (Esto con fines puramente visuales)
            Thread.sleep(2000);
            button.click();
            System.out.println("Boton presionado");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            driver.close();
        }

    }

}
