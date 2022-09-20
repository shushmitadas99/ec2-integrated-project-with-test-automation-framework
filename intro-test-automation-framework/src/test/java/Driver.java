/*
    BACH DELETED THIS CLASS IN DEMO. I KEPT IT FOR REFERENCE
*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        //Client interview Q: How do you set up Selenium?
        //In Python, it's slightly different than in Java

        /*
           Old Approach
        */
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shush\\IdeaProjects\\intro-test-automation-framework\\src\\test\\resources\\chromedriver.exe");

        /*
           New Approach: Use WebDriverManager (other dependency we must install from mvnrepository)
        */
        WebDriverManager.chromedriver().setup(); //it will automatically download the appropriate chromedriver,
        // so that we don't even need to manually download it

        //instantiate Webdriver object

        WebDriver driver = new ChromeDriver(); //in python: driver = webdriver.Chrome("./chromedriver");
        driver.get("https://www.google.com/");

        Thread.sleep(5000);

        driver.quit();

    }
}
