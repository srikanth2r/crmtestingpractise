package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src\\test\\java\\Features"},
	glue= {"stepdefinations"},
	plugin= {"pretty",
			"json:target/MyReports/report.json",
			"junit:target/MyReports/report.xml"
	},
	monochrome=false
	//dryrun=true
	//strict=false
			
)
public class AmazonSearch {

}
