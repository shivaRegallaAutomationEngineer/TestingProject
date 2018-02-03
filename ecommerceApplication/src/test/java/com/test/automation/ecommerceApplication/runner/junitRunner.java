package com.test.automation.ecommerceApplication.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "ecommerceProject",glue="com.test.automation.ecommerce.test_Cases"
		)

public class junitRunner {

}
