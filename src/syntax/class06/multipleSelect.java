package syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleSelect {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

       WebElement statesDD = driver.findElement(By.cssSelector("select#multi-select"));

        Select select=new Select(statesDD);
         boolean multiple=select.isMultiple();
        System.out.println(multiple);

        select.selectByIndex(0);
        Thread.sleep(2000);
        select.selectByVisibleText("Texas");
        Thread.sleep(2000);
        select.selectByValue("Ohio");
        Thread.sleep(2000);


        }


    }

}
