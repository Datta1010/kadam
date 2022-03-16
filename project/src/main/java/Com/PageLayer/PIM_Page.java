package Com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.BaseLayer.BaseClass;

public class PIM_Page extends BaseClass {

	@FindBy(xpath = "//b[text()='PIM']")
	private WebElement pim;

	@FindBy(xpath = "//input[@name='btnAdd']")
	private WebElement Addbtn;

	@FindBy(id = "firstName")
	private WebElement fname;

	@FindBy(id = "lastName")
	private WebElement lname;

	@FindBy(xpath = "//input[@value='Save']")
	private WebElement savebtn;

	public PIM_Page() {
		PageFactory.initElements(driver, this);
	}

	public void Click_On_Pim() {
		pim.click();
	}

	public void Click_On_AddButton() {
		Addbtn.click();
	}

	public void Enter_Username_In_personl() {
		fname.sendKeys("sham");
	}

	public void Enter_Lastname_In_Personl() {
		lname.sendKeys("Bhosale");
	}

	public void Click_On_Save_Button() {
		savebtn.click();
		
		
	}

}
