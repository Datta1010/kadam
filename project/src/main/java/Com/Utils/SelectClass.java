package Com.Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Com.BaseLayer.BaseClass;

public class SelectClass extends BaseClass {

	public static void selectDropDownValue(WebElement wb, String value) {

		Select sel = new Select(wb);
		sel.selectByVisibleText(value);

	}

}
