package is.demo.serenity.steps;

import is.demo.serenity.pageObject.ListEmployeePage;
import is.demo.serenity.pageObject.ListOrderPage;
import is.demo.serenity.utils.RandomSelection;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ListEmployeeSteps {

    @Page
    ListEmployeePage listEmployeePage;

    @Step
    public void listEmployee(){
        List<WebElement> employees = listEmployeePage.getDriver().findElements(listEmployeePage.getLsEmployee());
        WebElement employee = RandomSelection.selectOrders(employees);
        employee.click();
    }
}
