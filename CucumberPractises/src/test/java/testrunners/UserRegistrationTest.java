package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\AppFeatures\\registration.feature"},glue={"stepdefinitions"},plugin= {"pretty"},monochrome=true)
public class UserRegistrationTest {
	
}
