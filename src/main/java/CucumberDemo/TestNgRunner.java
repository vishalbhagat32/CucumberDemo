package CucumberDemo;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@CucumberOptions(

        //tags= "@tag1",
        //glue = {"CucumberDemo"},
        features = {"src/main/resources"},
        plugin = {"pretty", "html:target/cucumber.html"}


)


public class TestNgRunner extends AbstractTestNGCucumberTests {
}
