package TestRrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\dasbi\\eclipse-workspace\\FacebookpageTest\\src\\test\\resources\\Features\\login1.feature",glue="StepDefinitions",dryRun=false,
plugin={"pretty","html:target/HtmlReports",
		"json:target/JSONReports/report.json",
		"junit:target/JUnitReports/report.xml"})

public class Run {
//
//	
}
