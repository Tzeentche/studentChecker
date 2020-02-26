import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\Projects\\me.eightydays\\Drivers\\chromedriver.exe");
//
//        WebDriver driverChrome = new ChromeDriver();
//        driverChrome.get("https://prelaunch.eightydays.me/");

        System.setProperty("webdriver.gecko.driver", "C:\\JAVA\\Projects\\me.eightydays\\Drivers\\geckodriver.exe");

        WebDriver driverFox = new FirefoxDriver();
        driverFox.get("https://prelaunch.eightydays.me/");

        String str = driverFox.getTitle();
        System.out.println(str);

        WebElement text = driverFox.findElement(By.xpath("//div[@id='home-form-city-start']/div/div/div"));

        System.out.println(text);
    }
}
