package demo;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = "message:target/cucumber-report.ndjson")
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}
