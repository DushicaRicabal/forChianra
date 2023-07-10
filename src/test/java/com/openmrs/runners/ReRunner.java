package com.openmrs.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "@target/uiFailedTests.txt",
        glue ="com/openmrs/stepdefinitions",
        dryRun = false,
        tags = "@regression",
        plugin = {"pretty","html:target/uiReprot.html","rerun:target/uiReport.html","rerun:target"}
)


public class ReRunner {

}
