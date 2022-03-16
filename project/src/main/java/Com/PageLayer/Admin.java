package Com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.BaseLayer.BaseClass;
import Com.Utils.SelectClass;

public class Admin extends BaseClass {
	
	
	@FindBy(xpath="//b[text()='Admin']")
	private WebElement admin;
	@FindBy(name="btnAdd")
	private WebElement addbtn;
	@FindBy(id="systemUser_userType")
	private WebElement dprole;
	
	@FindBy(id="systemUser_employeeName_empName")
	private WebElement emplyee;
	
	@FindBy(id="systemUser_status")
	private WebElement dpStatus;
	
	
	
	public Admin () {
		PageFactory.initElements(driver, this);
	}
	 public void click_On_Admin_Button() {
		 admin.click();
	 }
	public void click_On_Add_Button() {
		addbtn.click();
	}
	public void select_Dropdoun_value() {
		SelectClass.selectDropDownValue(dprole, "Admin");
	
	}
	public void enter_emplyee_Id(String name) {
		emplyee.sendKeys(name);
	}
	public void select_dropdoun_Status(String dpvalue){
		SelectClass.selectDropDownValue(dpStatus, dpvalue);
	}
	
	
}
