package stepdefinitions;

/**
 * Created by Orasi_SA on 4/13/2017.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import com.hpe.alm.octane.OctaneCucumber;

@RunWith(OctaneCucumber.class)


@CucumberOptions(
        features = "src/test/java/com/orasi/Features",
        glue = "com.orasi.stepdefinitions",
        plugin = {
                "pretty",
                "json:RunResults/cucumber.json",
                "json:RunResults/cucumber.xml",
                "json:RunResults/cucumber.html"})

public class TestRunner {
    @Test
    public void test() {}

}
