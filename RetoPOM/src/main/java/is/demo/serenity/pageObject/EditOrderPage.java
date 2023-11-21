package is.demo.serenity.pageObject;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class EditOrderPage extends PageObject {

    //input de empleados
    private final By listEmployee = By.id("s2id_autogen9");

    //Lista de empleados
    private final By employee = By.xpath("//li[@class='select2-results-dept-0 select2-result select2-result-selectable select2-highlighted']");

    public By getListEmployee() {
        return listEmployee;
    }

    public By getEmployee() {
        return employee;
    }
}
