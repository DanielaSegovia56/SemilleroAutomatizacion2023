package is.demo.serenity.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import is.demo.serenity.steps.EditOrderSteps;
import is.demo.serenity.steps.ListOrderSteps;
import is.demo.serenity.steps.WelcomeSteps;
import net.thucydides.core.annotations.Steps;

public class ChangeNameStepDefinitions {

    @Steps
    ListOrderSteps listOrderSteps;

    @Steps
    WelcomeSteps welcomeSteps;

    @Steps
    EditOrderSteps editOrderSteps;

    @When("User do click on open orders button and select any of the orders")
    public void userDoClickOnOpenOrdersButtonAndSelectAnyOfTheOrders() {
        welcomeSteps.clickOnMoreInformation();
        listOrderSteps.listOrders();
    }
    @When("user select an employee")
    public void userSelectAnEmployee() {
        editOrderSteps.clickOnEmployee();
        editOrderSteps.selectEmployee();
        editOrderSteps.saveInformation();
    }

    @Then("user can view the new employee name")
    public void userCanViewTheNewEmployeeName() {

    }
}
