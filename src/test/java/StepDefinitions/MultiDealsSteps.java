package StepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MultiDealsSteps {

    WebDriver driver;

   @Before
   public void InitalizeBrowser(){
       driver = new ChromeDriver();
       driver.manage().window().maximize();
   }

   @After
   public void closeBrowser(){
       driver.quit();
    }

    @Given("^User is on Application Page$")
    public void user_is_on_Application_Page()  {

        driver.get("https://www.freecrm.com/index.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @Before("@Smoke")
    public void beforeSmoke(){
       System.out.println("Hi I am Pre-Req of Smoke ");
    }

    @After("@Smoke")
    public void afterSmoke(){
       System.out.println("After Smoke Test");
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
        for (Map<String, String> dataMap : credentials.asMaps(String.class, String.class)) {
            driver.findElement(By.name("email")).sendKeys(dataMap.get("username"));
            driver.findElement(By.name("password")).sendKeys(dataMap.get("password"));

        }
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
    public void user_enters_deal_form(DataTable data) {
        for (Map<String, String> dataMap : data.asMaps(String.class, String.class)) {
            driver.findElement(By.name("title")).sendKeys(dataMap.get("Title"));
            driver.findElement(By.name("amount")).sendKeys(dataMap.get("Amount"));
            driver.findElement(By.name("probability")).sendKeys(dataMap.get("Probability"));
            driver.findElement(By.name("commission")).sendKeys(dataMap.get("Commission"));
            driver.findElement(By.name("description")).sendKeys(dataMap.get("Description"));
            driver.findElement(By.name("next_step")).sendKeys(dataMap.get("Next Step"));
            driver.findElement(By.xpath("//i[@class = \"save icon\"]")).click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(By.xpath("//i[@class = \"money icon\"]")).click();
            driver.findElement(By.xpath("//i[@class = \"edit icon\"]")).click();

        }

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
