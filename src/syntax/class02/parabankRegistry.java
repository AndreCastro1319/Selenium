package syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parabankRegistry {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=7513AC76A3D3314DA6104AF320259792");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Jimmy");
        driver.findElement(By.id("customer.lastName")).sendKeys("Castro");
        driver.findElement(By.id("customer.address.street")).sendKeys("1234 Shakira Shakira st");
        driver.findElement(By.id("customer.address.city")).sendKeys("Flavor Town");
        driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("000007");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123-541-0897");
        driver.findElement(By.id("customer.ssn")).sendKeys("111-84-9632");
        driver.findElement(By.id("customer.username")).sendKeys("Jimito420");
        driver.findElement(By.id("customer.password")).sendKeys("jimcarrey7777");
        driver.findElement(By.id("repeatedPassword")).sendKeys("jimcarrey7777");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();
        driver.quit();
    }
}
