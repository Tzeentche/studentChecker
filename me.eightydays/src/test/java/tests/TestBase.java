package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.TaskOne;
import page.Main;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;
    public Main main;
    public TaskOne taskOne;

    String SITE_URL = "https://prelaunch.eightydays.me/";

    @BeforeEach
    public void prelaunchSteps() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        main = PageFactory.initElements(driver, Main.class);
        taskOne = PageFactory.initElements(driver, TaskOne.class);
    }

    @AfterEach
    public void outerSteps() {
    }
}
