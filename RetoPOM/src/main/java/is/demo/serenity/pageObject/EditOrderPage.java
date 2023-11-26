package is.demo.serenity.pageObject;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class EditOrderPage extends PageObject {

    private final By spanEmployee = By.id("select2-chosen-9");
    private final By btnSave = By.xpath("//i[@class='fa fa-clipboard-check text-purple']");
    private final By lbSaveSuccessfully = By.xpath("//div[@class='toast-message']");


    public By getSpanEmployee() {
        return spanEmployee;
    }
    public By getBtnSave() {
        return btnSave;
    }
    public By getLbSaveSuccessfully() {
        return lbSaveSuccessfully;
    }
}
