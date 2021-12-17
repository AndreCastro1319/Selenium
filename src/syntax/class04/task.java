package syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='form-hint']/preceding-sibling::input")).sendKeys("Admin");
        driver.findElement(By.xpath("//span[starts-with(text(),'Password')]/preceding-sibling::input")).sendKeys("Hum@nhrm123");
        Thread.sleep(2000);
         WebElement click=driver.findElement(By.id("//input[starts-with(@value,'LOG')]"));
         click.click();

    }
}
