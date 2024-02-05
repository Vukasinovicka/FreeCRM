/*package StepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DealSteps {

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

    @Then("^User enters username and password$")
    public void user_enters_username_and_password(DataTable credentials) {
        List<List<String>> testData = credentials.raw();
        driver.findElement(By.name("email")).sendKeys(testData.get(0).get(0));
        driver.findElement(By.name("password")).sendKeys(testData.get(0).get(1));

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

    @Then("^Go to Deals$")
    public void go_to_Deals()  {
        driver.findElement(By.xpath("//i[@class = \"money icon\"]")).click();

    }

    @Then("^Open New Deal form$")
    public void open_New_Deal_form() {
        driver.findElement(By.xpath("//i[@class = \"edit icon\"]")).click();
    }

    @Then("^user enters deal form$")
    public void user_enters_deal_form(DataTable data)  {
        List<List<String>> formData = data.raw();
        driver.findElement(By.name("title")).sendKeys(formData.get(0).get(0));
        driver.findElement(By.name("amount")).sendKeys(formData.get(0).get(1));
        driver.findElement(By.name("probability")).sendKeys(formData.get(0).get(2));
        driver.findElement(By.name("commission")).sendKeys(formData.get(0).get(3));
        driver.findElement(By.name("description")).sendKeys(formData.get(0).get(4));
        driver.findElement(By.name("next_step")).sendKeys(formData.get(0).get(5));

    }

    @Then("^Save the Deal$")
    public void save_the_Deal()  {
        driver.findElement(By.xpath("//i[@class = \"save icon\"]")).click();

    }

    @Then("^Close the Browser$")
    public void close_the_Browser() {
        driver.close();

    }

}


 */