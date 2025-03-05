package com.sample;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	       
        features = "src\\test\\resources",
        glue="com.stepDef",
        dryRun=false,
        monochrome=true,
        tags="@wrong or @login",
        plugin={"pretty","json:path/to/json_repot.json"}
       
      
        )
public class RunnerFile extends AbstractTestNGCucumberTests {

}

