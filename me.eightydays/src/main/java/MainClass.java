import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass {

    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\Projects\\me.eightydays\\Drivers\\chromedriver.exe");
//
//        WebDriver driverChrome = new ChromeDriver();
//        driverChrome.get("https://prelaunch.eightydays.me/");

        System.setProperty("webdriver.gecko.driver", "C:\\JAVA\\Projects\\me.eightydays\\Drivers\\geckodriver.exe");

        WebDriver driverFox = new FirefoxDriver();
        driverFox.get("https://prelaunch.eightydays.me/");
    }
}
