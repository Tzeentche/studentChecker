package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main extends BasePage {

    String SITE_URL = "https://prelaunch.eightydays.me/";

    public Main(WebDriver driver) {
        super(driver);
    }

    public Main goTo() {
        driver.get(SITE_URL);
        return this;
    }

    public Main chooseCityFrom(String cityName) {
        click(By.xpath("//div[contains(text()," + cityName + ")])[1]"));
        return this;
    }
}
