package is.demo.serenity.pageObject;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class EditOrderPage extends PageObject {

    private final By spanEmployee = By.id("select2-chosen-9");
    private final By lsEmployee3 = By.xpath("//li[@class='select2-results-dept-0 select2-result select2-result-selectable'][3]");

    private final By btnSave = By.xpath("//i[@class='fa fa-clipboard-check text-purple']");

    public By getSpanEmployee() {
        return spanEmployee;
    }

    public By getLsEmployee3() {
        return lsEmployee3;
    }

    public By getBtnSave() {
        return btnSave;
    }
}
