package syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class multipleboxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        List<WebElement> boxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        //print the size of the checkboxes
        int size = boxes.size();
        System.out.println("The size is : "+size);

        for (WebElement checkboxes : boxes) {
                checkboxes.click();
            String valueofattribute= checkboxes.getAttribute("value");
            System.out.println(valueofattribute);



            if (checkboxes.getAttribute("value").equals("Option-3")) {

                checkboxes.click();

            }



        }
    }}
