package com.bloomerang.cukeRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "src/test/java/steps",
features = "@target/rerun.txt")

public class FailedRunner {






}
