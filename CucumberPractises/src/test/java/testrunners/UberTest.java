package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\AppFeatures\\Uber.feature"},glue={"stepdefinitions"},tags="@All",plugin= {"pretty","json:target/MyReports/report.json","junit:target/MyReports/report.xml","html:target/MyReports/report.html"},monochrome=true,publish=true,dryRun=true)
public class UberTest {
	
}
