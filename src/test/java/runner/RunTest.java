package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/CreateAccounts.feature",
				 glue = {"steps","hooks"},
				 monochrome = true,publish=true)
public class RunTest extends AbstractTestNGCucumberTests{
	

	
}
