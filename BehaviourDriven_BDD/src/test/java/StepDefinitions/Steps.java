package StepDefinitions;

import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

public class Steps {
    public WebDriver driver;
    public LoginPage lp;
    @Given("User Launch Chrome browser")
    public void user_launch_chrome_browser() {
        System.out.println("chrome launched");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        lp = new LoginPage(driver);// Login Page object to access methods

    }
    @When("User opens URl {string}")
    public void user_opens_u_rl(String url) {
        System.out.println("");
        driver.get(url);

    }
    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) {
    lp.setUserName(email);
    lp.setPassword(password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @When("Click on Login")
    public void click_on_login() throws InterruptedException {
        lp.clickLogin();
        Thread.sleep(3000);

    }
    @Then("Page  should be Dashboard  nopCommerce administration")
    public void page_title_should_be_() throws InterruptedException {
        String title ="Dashboard / nopCommerce administration";

        if (driver.getPageSource().contains("Login was unsuccessful.")) {
            driver.close();
            //Assert.assertTrue(false);
        } else {
            Assert.assertEquals(title,driver.getTitle());
        }

        Thread.sleep(1000);
    }

    @When("User Click on Log out link")
    public void user_click_on_log_out_link() throws InterruptedException {
        lp.clickLogout();
        Thread.sleep(3000);


    }
    @Then("Title should be Your store. Login")
    public void name_should_be() throws InterruptedException {
    String logouttitle = "Your store. Login";
        if(driver.getPageSource().contains("Login was unsuccessful.")) {

           driver.close();
            Assert.assertTrue(false);
        } else {
            Assert.assertEquals(logouttitle,driver.getTitle());
            //System.out.println(driver.getTitle());

        }
            Thread.sleep(3000);

        }

    @Then("close browser")
        public void close_browser()  {
        //Thread.sleep(3000);
        driver.close();
    }


    }



