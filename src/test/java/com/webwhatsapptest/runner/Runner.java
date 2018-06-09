/*
 * Author : H Sri Harsha This is the runner file which will be used by cucumber.
 */

package com.webwhatsapptest.runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features",
    glue = {"classpath:com.webwhatsapptest.chats", "classpath:com.webwhatsapptest.profiles","classpath:com.webwhatsapptest.contactinfo"})
public class Runner extends AbstractTestNGCucumberTests {

}
