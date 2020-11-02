package com.library.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/features",
        glue = "com/library/step_definitions",
        dryRun = false,
        tags = " @AC4"
)
public class CucumberRunner {
}