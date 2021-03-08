package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMsteps {

    WebDriver driver;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C://Users//Diwash PC//Desktop//Selenium Learning//selenium jars and drivers//drivers//chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("I open orange hrm homepage")
    public void i_open_orange_hrm_homepage() {
        driver.get("https://opensource-demo.orangehrmlive.com");
    }

    @Then("I verify that the logo present on page")
    public void i_verify_that_the_logo_present_on_page() {
        boolean status = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertEquals(true, status);
    }

    @Then("I close broswer")
    public void i_close_broswer() {
        driver.quit();
    }
}
