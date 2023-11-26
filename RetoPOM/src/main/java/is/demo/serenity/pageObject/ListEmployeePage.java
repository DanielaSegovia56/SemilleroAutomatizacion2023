package is.demo.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ListEmployeePage extends PageObject {

    private final By lsEmployee = By.id("select2-results-9");

    public By getLsEmployee() {
        return lsEmployee;
    }
}
