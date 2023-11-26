package is.demo.serenity.stepDefinitions;

import io.cucumber.java.en.*;
import is.demo.serenity.pageObject.ListEmployeePage;
import is.demo.serenity.steps.EditOrderSteps;
import is.demo.serenity.steps.ListEmployeeSteps;
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

    @Steps
    ListEmployeeSteps listEmployeeSteps;

    @When("User do click on open orders button and select any of the orders")
    public void userDoClickOnOpenOrdersButtonAndSelectAnyOfTheOrders() {
        welcomeSteps.clickOnMoreInformation();
        listOrderSteps.listOrders();
    }
    @When("user select an employee")
    public void userSelectAnEmployee() {
        editOrderSteps.clickOnEmployee();
        listEmployeeSteps.listEmployee();
        editOrderSteps.saveInformation();
    }

    @Then("user can view the alert of saving successfully")
    public void userCanViewTheAlertOfSavingSuccessfully() {
        editOrderSteps.validateChange();
    }
}
