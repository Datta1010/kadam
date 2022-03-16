package Com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Com.AllFeature/Login.feature"},
		glue = {"Com.StepDefination"},
		
		dryRun=false,
		monochrome=true,
				plugin = {"html:Reports/orange.html",
						"json:Reports/orange.json",
						"junit:Reports/ornage.xml"}
		
		//tags ="@PIMPage or @AdminPage"
		//tags= "@MyInfo"
		)
 class TestRunner {

}
