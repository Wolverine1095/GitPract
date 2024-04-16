package org.com.runner;

import org.com.report.ReportGeneration;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features", glue="org.com.stepdef", dryRun=false, tags="@tag", plugin= {"json:target\\Cucumber Json report"}, monochrome=true)
public class RunnerClass {
	@AfterClass
	public static void reportMethod() {
		ReportGeneration.generateReport("D:\\Studies\\Java-Selenium\\DataDrivenFramework\\target\\Cucumber Json report");
	}
	
	public static void main(String[] args) {
		System.out.println("completed");
	}
}
