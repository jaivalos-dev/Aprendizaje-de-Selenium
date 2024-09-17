package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// #1 Import Action and Actions
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class DragAndDrop {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/droppable");
        driver.manage().window().maximize();

        //Encontrar el elemento en cuestion
        WebElement WorkSpace = driver.findElement(By.id("simpleDropContainer"));
        //Desplazar el navegador hasta el botón
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", WorkSpace);

        // #2 - Instantiate the actions class
        Actions action = new Actions(driver);

        // #3 - Define from and to
        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to = driver.findElement(By.id("droppable"));

        // #4 - Using the method Drag and Drop
        //action.dragAndDrop(from, to).build().perform();

        // #5 - It can also use X and Y properties
        action.dragAndDropBy(from, 270, 36).build().perform();

    }

}
