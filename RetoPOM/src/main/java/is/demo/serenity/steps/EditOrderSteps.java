package is.demo.serenity.steps;

import is.demo.serenity.pageObject.EditOrderPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

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

    @Step
    public void saveInformation(){
        editOrderPage.getDriver().findElement(editOrderPage.getBtnSave()).click();
    }

    @Step
    public void validateChange(){
        Assert.assertEquals("Guardar con éxito", editOrderPage.getDriver().
                findElement(editOrderPage.getLbSaveSuccesfully()).getText());
        //editOrderPage.getDriver().findElement(editOrderPage.getLbSaveSuccesfully()).getText();
    }
}
