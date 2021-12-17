package syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdowns {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();


        //find the Webelement "dropdown"
       WebElement days=driver.findElement(By.cssSelector("select#select-demo"));
        Select select=new Select(days);

       // select.selectByIndex(1);
       // Thread.sleep(2000);
       // select.selectByIndex(2);
       // Thread.sleep(2000);
      //  select.selectByIndex(7);
      //  Thread.sleep(2000);
      //  select.selectByVisibleText("Thursday");
      // select.selectByValue("Friday");


       List<WebElement> allOptions = select.getOptions();
        int Size= allOptions.size();
        System.out.println(Size);
        for(int i=0;i<Size;i++){
          String OptionText =  allOptions.get(i).getText();
            System.out.println(OptionText);

        }

    }
}
