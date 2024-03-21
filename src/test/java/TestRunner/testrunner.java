package TestRunner;



import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import report.ReportGeneration;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\aravind\\eclipse-workspace\\cucumber\\src\\withDataTable.feature",
glue="StepDefinitation",dryRun=false,monochrome=true,strict=true,snippets=SnippetType.UNDERSCORE,
plugin= {"pretty",
		
		           "json:C:\\Users\\aravind\\eclipse-workspace\\cucumber\\reportJVM\\reportjson.json"})



public class testrunner {
	@AfterClass
	public static void report() {
		

		//ReportGeneration.GenerationReport("C:\\Users\\aravind\\eclipse-workspace\\cucumber\\reportJVM\\reportjson.json");
		System.out.println("end");
	}

}
	