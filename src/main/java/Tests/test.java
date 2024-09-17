package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args){

        //System.setProperty("webdriver.chrome.driver", "");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        driver.close();

    }
}
