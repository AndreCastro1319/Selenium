package syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchingBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //WebDriver driver1=new FirefoxDriver();

        // calling a get method to get to a particular website
        driver.get("http://www.google.com");

        //returns the current url loaded in the browser
        String url=driver.getCurrentUrl();
        System.out.println("The current URL loaded in browser is :"+url);

        //returns the tittle of the current page in browser
        String tittle=driver.getTitle();
        System.out.println("The current tittle of the page is :"+tittle);

        driver.quit();
    }


}
