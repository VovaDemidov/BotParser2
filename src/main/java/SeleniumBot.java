import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBot {

    public static void parsing() {

        System.setProperty ("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver ( );
        driver.get ("https://5ka.ru/");

        System.out.println ("Connected");

      //  System.out.println (driver.getPageSource ( ));

        WebElement button = driver.findElement (By.cssSelector (".common-tabs__item-wrapper:nth-child(1) .focus-btn__content"));

        System.out.println ("Found special offers");

        button.click ( );

        System.out.println ("Clicked");

        button= driver.findElement (By.cssSelector (".common-tabs__item-wrapper:nth-child(1) .focus-btn__content") );

        System.out.println ("Found shop");

        button.click ( );

        System.out.println ("Clicked");




        //  driver.quit ( );




     /*
#__layout > main > div:nth-child(1) > main > div > div.grid-wrap > div.col-12 > section > div.filter-city.city-filter > button > div > span.d-md-none

     #__layout > main > div:nth-child(1) > main > div > div.grid-wrap > div.col-12 > section > div.filter-city.city-filter > div > button.btn-main.ring.red.select-nearest-store-first-view.focus-btn

.common-tabs__item-wrapper:nth-child(1) .focus-btn__content


     */
    }


}
