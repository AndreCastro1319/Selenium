package syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='list-group-item'][text()='Simple Form Demo']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Jimmy es un cabron");
        driver.findElement(By.xpath("//button[text()=‘Show Message’]")).click();







    }
}
