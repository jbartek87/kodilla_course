package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class FacebookTestingApp {
    public static final String XPATH_WAIT_FOR_FIRST= "//select[1]";
    public static final String XPATH_WAIT_FOR_SECOND= "//select[2]";
    public static final String XPATH_WAIT_FOR_THIRD= "//select[3]";
    public static final String XPATH_SELECT_FIRST= "//div[contains(@class, \"large_form\")]/div/div/span/span/select[1]";
    public static final String XPATH_SELECT_SECOND= "//div[contains(@class, \"large_form\")]/div/div/span/span/select[2]";
    public static final String XPATH_SELECT_THIRD = "//div[contains(@class, \"large_form\")]/div/div/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("http://facebook.com/");


        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_FIRST)).isDisplayed());
        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_SECOND)).isDisplayed());
        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_THIRD)).isDisplayed());

        WebElement selectComboFirst = driver.findElement(By.xpath(XPATH_SELECT_FIRST));
        Select selectBoard = new Select(selectComboFirst);
        selectBoard.selectByIndex(1);

        WebElement selectComboSecond = driver.findElement(By.xpath(XPATH_SELECT_SECOND));
        Select selectBoardSecond = new Select(selectComboSecond);
        selectBoardSecond.selectByIndex(1);

        WebElement selectComboThird = driver.findElement(By.xpath(XPATH_SELECT_THIRD));
        Select selectBoardThird = new Select(selectComboThird);
        selectBoardThird.selectByIndex(1);
//        searchField.submit();
    }
}
