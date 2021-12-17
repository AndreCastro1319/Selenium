package syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
        //getting the radio button webElement
        WebElement femaleButton=driver.findElement(By.xpath("//input[@value='Female'][@name='optradio']"));
        //click the radio button female
        // femaleButton.click();

        //check if the radio button is display
        boolean isDisplayed = femaleButton.isDisplayed();
        System.out.println("The female radio is displayed on the webPage : "+isDisplayed);

        //checking if the radio is enabled
        boolean isEnabled=femaleButton.isEnabled();
        System.out.println("The female radio is enabled on the webPage: "+isEnabled);

        //checking if the radio is selected
        boolean isSelected=femaleButton.isSelected();
        System.out.println("The female radio is selected on the webPage: "+isSelected);

        // select the female radio button only if is enabled.
        if(isEnabled){
            femaleButton.click();
        }
        // after clicking the button print if its selected or not
        //
        isSelected= femaleButton.isSelected();
        System.out.println("The female radio is selected on the webPage: "+isSelected);
    }
}
