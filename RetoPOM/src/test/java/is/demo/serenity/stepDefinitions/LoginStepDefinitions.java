package is.demo.serenity.stepDefinitions;

import io.cucumber.java.en.*;
import is.demo.serenity.steps.LoginSteps;
import is.demo.serenity.steps.WelcomeSteps;
import net.thucydides.core.annotations.Steps;


public class LoginStepDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Steps
    WelcomeSteps welcomeSteps;

    @Given("user open the browser")
    public void userOpenTheBrowser() {
        loginSteps.openBrowser();
    }
    @When("user insert credentials {string} {string} and click on sign in")
    public void userInsertCredentialsAndClickOnSignIn(String user, String pass) {
        loginSteps.cleanFields();
        loginSteps.sendCredentials();
        loginSteps.clickOnLogin();
    }
    @Then("user can view the word Dashboard on the screen")
    public void userCanViewTheWordDashboardOnTheScreen() {
        welcomeSteps.validateLogin();
    }
}
