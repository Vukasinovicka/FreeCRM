/*package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver;

    @Given("^User is on Application Page$")
    public void user_is_on_Application_Page()  {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.freecrm.com/index.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @When("^Application Page Title is Free CRM$")
    public void application_Page_Title_is_Free_CRM()  {
        String actualTitle = driver.getTitle();
        String expectedTitle = "#1 Free CRM Power Up your Entire Business Free Forever";
        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @Then("^User clicks log in button$")
    public void user_clicks_log_in_button()  {
        driver.findElement(By.xpath("//span[@class=\"icon icon-xs mdi-chart-bar\"]")).click();

    }

    @Then("^User enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_username_and_password(String uname, String password) {
        driver.findElement(By.name("email")).sendKeys(uname);
        driver.findElement(By.name("password")).sendKeys(password);

    }

    @Then("^User clicks on Login button$")
    public void user_clicks_on_Login_button() {
        driver.findElement(By.xpath("//div[@class = \"ui fluid large blue submit button\"]")).click();

    }


    @When("^User navigate to user profile$")
    public void user_navigate_to_user_profile() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Cogmento CRM";
        Assert.assertEquals(expectedTitle,actualTitle);
        }

    @Then("^Go to Contacts$")
    public void go_to_Contacts() {
        driver.findElement(By.xpath("//i[@class = \"users icon\"]")).click();

    }

    @Then("^Open Contact form$")
    public void open_Contact_form()  {
        driver.findElement(By.xpath("//i[@class = \"edit icon\"]")).click();

    }

    @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_and_and_and(String firstName, String lastName, String mobile, String position)  {
        driver.findElement(By.name("first_name")).sendKeys(firstName);
        driver.findElement(By.name("last_name")).sendKeys(lastName);
        driver.findElement(By.name("value")).sendKeys(mobile);
        driver.findElement(By.name("position")).sendKeys(position);
    }

    @Then("^Save the Contacts$")
    public void save_the_Contacts()  {
        driver.findElement(By.xpath("//i[@class = \"save icon\"]")).click();

    }

    @Then("^Close the Browser$")
    public void close_the_Browser()  {
        driver.close();

    }

}

 */





