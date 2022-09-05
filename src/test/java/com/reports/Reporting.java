package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	
	public static  void generateJvmReport(String jsonFile) {

//		mention the path of json report where to store
		File file = new File("C:\\Users\\praba\\eclipse-workspace\\OMRBranchAdactinAutomation\\target");
		
//		create the object for configuration class
		Configuration configuration = new Configuration(file,"FaceBook Automation");
	
//		pass the browser, os,Sprint, details
		configuration.addClassifications("Browser","Chrome");
		configuration.addClassifications("BrowserVersion","104");
		configuration.addClassifications("os","WIN10");
		configuration.addClassifications("Sprint","34");
		
//		Create the object for ReportBuilder Class--->pass the json file to fetch the results
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles,configuration);
		
//		Build the jvm Report
		builder.generateReports();
}


}
