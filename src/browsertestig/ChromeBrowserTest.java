package browsertestig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl="https://demo.nopcommerce.com/";//key to open web driver
        //most important step learn by heart for interview
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();//for maximize screen
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will wait to load browser
        driver.get(baseUrl);//to open browser
       String title= driver.getTitle();//to get title
       boolean verifyTitle= title.equals("nopCommerce demo store");//compare

       boolean verifyTitleContain= title.contains("login");
        System.out.println(verifyTitle);
        System.out.println(verifyTitleContain);
        System.out.println(title);
        System.out.println(title.length());
        String pagesource=driver.getPageSource();
        System.out.println(pagesource);
        driver.close();//to close automatically
       // driver.quit();


    }
}
