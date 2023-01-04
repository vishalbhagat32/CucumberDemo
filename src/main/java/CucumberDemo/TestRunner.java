package CucumberDemo;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        tags= "@tag1",
        glue = {"CucumberDemo"},
        features = {"src/main/resources"},
        plugin = {"pretty", "html:target/cucumber.html"}


)






public class TestRunner {
}
