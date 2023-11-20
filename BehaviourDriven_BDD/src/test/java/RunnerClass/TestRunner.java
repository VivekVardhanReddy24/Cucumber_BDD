package RunnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"C:\\Users\\vivek\\IdeaProjects\\BehaviourDriven_BDD\\src\\test\\java\\Features"},
        glue = {"StepDefinitions"},
        plugin={"pretty:STDOUT","html:target/cucumber-html-report",
        "json:target/cucumber.json",
        "junit:target/cucumber.xml",
        "rerun:target/rerun.txt"},



        tags ="@nopcommerceWebsite"
)



public class TestRunner {
}

