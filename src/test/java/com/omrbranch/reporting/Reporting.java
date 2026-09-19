package com.omrbranch.reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class Reporting {
	public static void generateJVMReport(String JsonFile) {
		
		File file = new File("C:\\Users\\HomePC\\eclipse-workspace\\Cucumber_Projects\\target");
		
		Configuration configuration = new Configuration(file, "Greens OMR Project");
		
		configuration.addClassifications("Browser Name", "Chrome");
		configuration.addClassifications("Browser version", "181");
		configuration.addClassifications("OS", "Windows 11");
		configuration.addClassifications("Testing", "Reg");
		configuration.addClassifications("Sprint", "34");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(JsonFile);
		
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();
		
		
	}

}
