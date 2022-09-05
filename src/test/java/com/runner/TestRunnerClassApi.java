package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(

//		tags=("@ChangeProfilePic"),
		publish = true, dryRun = true,stepNotifications=true,monochrome=true,
		features= {"src\\test\\resources\\Feature"},
		snippets=SnippetType.CAMELCASE,
		glue= {"com.stepdef"},
		plugin= {"pretty","json:target/Output.json"})
public class TestRunnerClassApi {

	@AfterClass
	public static void afterClass() {

		Reporting.generateJvmReport(
				"C:\\Users\\praba\\eclipse-workspace\\OMRBranchAdactinAutomation\\target\\AdactinReport.json");
		
		Reporting.generateJvmReport(
				"C:\\Users\\praba\\eclipse-workspace\\OMRBranchAdactinAutomation\\target\\AdactinReport.json");
		
	}
	private void add() {

		System.out.println("Hi");
	}

}
