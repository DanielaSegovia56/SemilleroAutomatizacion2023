package is.demo.serenity.steps;

import is.demo.serenity.pageObject.EditOrderPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class EditOrderSteps {

    @Page
    EditOrderPage editOrderPage;

    @Step
    public void clickOnEmployee(){
        editOrderPage.getDriver().findElement(editOrderPage.getSpanEmployee()).click();
    }

    @Step
    public void selectEmployee(){
        editOrderPage.getDriver().findElement(editOrderPage.getLsEmployee3()).click();
    }
}
