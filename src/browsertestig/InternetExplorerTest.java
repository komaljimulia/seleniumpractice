package browsertestig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class InternetExplorerTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";//key to open web driver
        //most important step learn by heart for interview
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get(baseUrl);//to open browser

  //      driver.manage().window().maximize();//for maximize screen
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will wait to load browser
        String title = driver.getTitle();//to get title
        boolean verifyTitle = title.equals("nopCommerce demo store\"");
        boolean verifyTitleContain= title.contains("login");
        System.out.println(verifyTitle);
        System.out.println(verifyTitleContain);
        System.out.println(title);
        System.out.println(title.length());
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        driver.close();
    }
}