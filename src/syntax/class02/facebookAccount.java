package syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookAccount {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Create")).click();

        Thread.sleep(20000);
        driver.findElement(By.name("firstname")).sendKeys("Jhonny");
       driver.findElement(By.name("lastname")).sendKeys("Bravo");
        driver.findElement(By.name("reg_email__")).sendKeys("JhonnyBravo@hunky.com");
       driver.findElement(By.name("reg_passwd__")).sendKeys("CowandChicken420");
        driver.findElement(By.name("birthday_month")).sendKeys("April");
       driver.findElement(By.name("birthday_day")).sendKeys("20");
        driver.findElement(By.className("_58mt")).sendKeys("Male");
       driver.findElement(By.name("websubmit")).click();
       Thread.sleep(2000);
       driver.quit();

    }
}
