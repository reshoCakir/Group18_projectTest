package com.library.step_definitions;

import com.library.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setup(Scenario scenario){
        System.out.println("scenario = " + scenario.getSourceTagNames());
        System.out.println(":::Starting Automation :::");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
        System.out.println("(*___*)End of test execution(*___*)");
    }

}
