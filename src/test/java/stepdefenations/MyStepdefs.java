package stepdefenations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {

   WebDriver driver;
    @Given("Open URL")
    public void openURL() {

        driver = new ChromeDriver();
    }

    @When("Click on Login btn")
    public void clickOnLoginBtn() {
    }

    @Then("Home page should be open")
    public void homePageShouldBeOpen() {

        driver.quit();
    }
}
