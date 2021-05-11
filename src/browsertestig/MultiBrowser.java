package browsertestig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class MultiBrowser {
    static String browser = "firefox";
    static String baseurl = "https://demo.nopcommerce.com/";
    static WebDriver driver;

    public static void main(String[] args)  {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseurl);
            driver.close();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            driver=new FirefoxDriver();
            System.out.println("Title: " + driver.getTitle());
            driver.get(baseurl);
            driver.close();
        }else if(browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
            driver=new InternetExplorerDriver();

           // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will wait to load browser
            System.out.println("Title: " + driver.getTitle());
            driver.close();

        }else {
            System.out.println("Wrong browser name");
        }
     //   driver.get(baseurl);


    }
}