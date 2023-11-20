package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login_StepDefinition {
    WebDriver driver;
    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
       WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println("open browser");


    }

    @When("I open orange HRM homepage")
    public void i_open_orange_hrm_homepage() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("Navigated to  Home Page Successfully");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Then("I verify that the logo present on page")
    public void i_verify_that_the_logo_present_on_page() {
        System.out.println("Control executed");
        boolean status= driver.findElement(By.cssSelector("img[alt='company-branding']")).isDisplayed();
        Assert.assertEquals(true, status);

    }

    /*@And("close browser")
    public void closingBrowser() {
        driver.quit();
        //throw new io.cucumber.java.PendingException();


    }*/
}
