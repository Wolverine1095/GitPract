package org.com.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;

public class ReportGeneration {
	public static void generateReport(String jsonfile) {
	File report = new File("D:\\Studies\\Java-Selenium\\DataDrivenFramework\\target\\Cucumber Json report");
	Configuration co = new Configuration(report, "reportnum1");
	co.addClassifications("OS", "linux");
	co.addClassifications("Date","22nd feb");
	List<String> li = new LinkedList<>();
	li.add(jsonfile);
	}
}
