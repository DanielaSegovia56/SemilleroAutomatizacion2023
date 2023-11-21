package is.demo.serenity.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import is.demo.serenity.steps.SelectOrderSteps;
import is.demo.serenity.steps.EditOrderSteps;
import net.thucydides.core.annotations.Steps;

public class ChangeNameStepDefinitions {

    @Steps
    SelectOrderSteps changeNameSteps;

    @Steps
    EditOrderSteps editOrderSteps;

    @When("User do click on open orders button and select any of the orders")
    public void userDoClickOnOpenOrdersButtonAndSelectAnyOfTheOrders() {
        changeNameSteps.clickOnMoreInformation();
        changeNameSteps.selectOrder();
    }
    @When("user select an employee")
    public void userSelectAnEmployee() {
        /*
        editOrderSteps.clickOnEmployee();
        editOrderSteps.selectList();
*/
    }
    @Then("user can view the new employee name")
    public void userCanViewTheNewEmployeeName() {

    }
}
