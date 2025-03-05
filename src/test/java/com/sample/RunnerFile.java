package com.sample;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	       
        features = "src\\test\\resources",
        glue="com.stepDef",
        dryRun=false,
        monochrome=true,
        plugin={"pretty","json:target/cucumber-reports/CucumberTestReport.json"}
       
      
        )
public class RunnerFile extends AbstractTestNGCucumberTests {

}

