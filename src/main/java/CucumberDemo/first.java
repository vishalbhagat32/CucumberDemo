package CucumberDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class first {
    static WebDriver driver;
    static String url = "https://www.youtube.com/";

    @Given("user navigates to the Homepage")
    public void user_navigates_to_the_homepage() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(6000);
        driver.manage().window().maximize();

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @When("User enters the details")
    public void user_enters_the_details() {
        WebElement search = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input"));
          search.click();
          search.sendKeys("bb ki vines");
        //driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("bb ki vines");
        driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/button")).click();

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Then("User logged in")
    public void user_logged_in() {

        System.out.println("search success");
        driver.quit();
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }



    }


