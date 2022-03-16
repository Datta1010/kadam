package Com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.BaseLayer.BaseClass;

public class My_Info_Page extends BaseClass {

	@FindBy(xpath = "//b[text()='My Info']")
	private WebElement info;

	public My_Info_Page() {
		PageFactory.initElements(driver, this);
	}

	public void click_On_Admin() {
		info.click();
		
		
		
	}

}
