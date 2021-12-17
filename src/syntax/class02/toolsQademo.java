package syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolsQademo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.className("form-control"));
        WebElement Textbox= driver.findElement(By.className("form-control"));
        Textbox.sendKeys("jimmmy");
    }
}
