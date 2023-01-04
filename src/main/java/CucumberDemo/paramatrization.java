package CucumberDemo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class paramatrization {

    static WebDriver driver;
    static String url = "https://www.youtube.com/";
    @Before("@tag2")
    public void beforeLogin(){
        System.out.println("before execution starts");
    }

    @Given("user navigates to the search Homepage")
    public void user_navigates_to_the_search_homepage() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(6000);
        driver.manage().window().maximize();
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("User enters the {string} details")
    public void user_enters_the_details(String search) {
        WebElement searching = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input"));
        searching.click();
        searching.sendKeys(search);
        //driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("bb ki vines");
        driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/button")).click();

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("User get logged in")
    public void user_get_logged_in() {
        System.out.println("search success");
        //driver.quit();
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @After("@tag1")
    public void afterLogin()
    {
        driver.quit();
        System.out.println("logout success");
    }
}
