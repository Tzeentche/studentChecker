package tests;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SecondClass extends TestBase {

    @Test
    public void createTrip() {
        driver.get(SITE_URL);

        //        tests.EightydaysTest eightydaysTest = new tests.EightydaysTest();

        open("https://prelaunch.eightydays.me/");

//        eightydaysTest.wait(1000);
        try {
            Thread.sleep(10000);
        } catch(InterruptedException e) {
            //  Обработка исключения
        }

//        From:
        $(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div[1]/div[1]/div[1]")).click();

        try {
            Thread.sleep(10000);
        } catch(InterruptedException e) {
            //  Обработка исключения
        }
//        City:
        $(By.xpath("\"/html/body/div[1]/div/div[1]/div/div[2]/div/form/div[1]/div[1]/div/div[2]/div/div[110]")).click();

        try {
            Thread.sleep(10000);
        } catch(InterruptedException e) {
            //  Обработка исключения
        }
//        Around:
        $(By.xpath("\"/html/body/div[1]/div/div[1]/div/div[2]/div/form/div[1]/div[2]/div[2]/div[1]/div[1]")).click();

        try {
            Thread.sleep(10000);
        } catch(InterruptedException e) {
            //  Обработка исключения
        }
//        Theme:
        $(By.xpath("\"/html/body/div[1]/div/div[1]/div/div[2]/div/form/div[1]/div[2]/div[2]/div[2]/div/div[2]")).click();

        try {
            Thread.sleep(10000);
        } catch(InterruptedException e) {
            //  Обработка исключения
        }
//        Dates:
        $(By.id("startDate")).click();

        try {
            Thread.sleep(10000);
        } catch(InterruptedException e) {
            //  Обработка исключения
        }
//      First date:
        $(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]")).click();

        try {
            Thread.sleep(10000);
        } catch(InterruptedException e) {
            //  Обработка исключения
        }
//        Last date:
        $(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[5]/td[3]")).click();

//        Thread.sleep(10000);
//        Anywhere:
//        $(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/form/div[1]/div[4]/label/div[1]")).click();
//        Include city:
//        $(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/form/div[1]/div[5]/div[1]/div/div[1]/div[1]/div[1]")).click();
//        Select city (Amsterdam):
//        $(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/form/div[1]/div[5]/div[1]/div/div[2]/div/div[6]")).click();
//        Exclude city:
//        $(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/form/div[1]/div[5]/div[1]/div/div[1]/div[1]/div[1]")).click();

        try {
            Thread.sleep(10000);
        } catch(InterruptedException e) {
            //  Обработка исключения
        }
//        I'm feeling lucky:
        $(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/form/div[3]/button")).click();

        try {
            Thread.sleep(10000);
        } catch(InterruptedException e) {
            //  Обработка исключения
        }

        String tryAgainCheck = $(By.xpath("(.//*[@id=\"root\"]//button)[20]")).getText();

        try {
            Thread.sleep(10000);
        } catch(InterruptedException e) {
            //  Обработка исключения
        }

        if (tryAgainCheck.equals("CONTINUE")) {
            System.out.println("Text is " + tryAgainCheck);

        } else if (tryAgainCheck.equals("TRY AGAIN")) {

            System.out.println(tryAgainCheck);
            System.out.println("Bad");
        }

//        Configuration.holdBrowserOpen = true;
    }
}
