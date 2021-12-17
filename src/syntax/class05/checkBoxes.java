package syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        WebElement checkBox=driver.findElement(By.id("//input[@id='isAgeSelected']"));
        checkBox.click();
        Thread.sleep(2000);
        //uncheck the box click again
        checkBox.click();

        //Task2 check all the text boxes simultanioustly
        //select a xpath has common attribute value for all the checkboxes

        List<WebElement> boxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
        //print the size of the checkboxes
        int size= boxes.size();
        for(WebElement checkboxes:boxes){
            if(checkboxes.getAttribute("value").equals("Option-3")){
                checkboxes.click();
            }


           //select the check box with the text Option 3

           //get the attribute "value
           checkboxes.getAttribute("value");







        }
    }
}
