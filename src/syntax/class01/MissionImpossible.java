package syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MissionImpossible {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://amazon.com");

        String url=driver.getCurrentUrl();
        System.out.println("The current URL loaded in browser is :"+url);


        String tittle=driver.getTitle();
        System.out.println("The current tittle of the page is :"+tittle);

        driver.quit();
    }
}
