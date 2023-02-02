package testrunners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\AppFeatures\\oreder.feature"},glue={"stepdefinitions"},plugin= {"pretty"},monochrome=true)
public class OrderTest {
	
}