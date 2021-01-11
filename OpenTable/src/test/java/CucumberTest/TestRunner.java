package CucumberTest;

import cucumber.api.CucumberOptions;
//for cucumber running using Junit
/*import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(*/
@CucumberOptions(
features = "Features/RegisterPage.feature"
,glue={"StepDefination"}
,tags= {"@tag2"}

)
public class TestRunner extends cucumber.api.testng.AbstractTestNGCucumberTests {

}
