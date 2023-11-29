package com.cg.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\TMARNE\\WorkSpace1\\Demo\\Feature\\Home.feature",
                 glue = "com.cg.steps",
                 monochrome = true)
public class TestRunner {

}
