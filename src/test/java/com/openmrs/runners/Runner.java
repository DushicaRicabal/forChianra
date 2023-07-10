package com.openmrs.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features" ,
        glue = "com/openmrs/stepdefinitions",
        dryRun = false,
        tags = "@smoke",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTest.txt",
                "json:target/cucumber-reports/cucumber.json"}//this file will be written from MAVEN
)
public class Runner {


}
