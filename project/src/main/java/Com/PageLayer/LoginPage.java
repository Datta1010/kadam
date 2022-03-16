package Com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.BaseLayer.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(id = "txtUsername")
	private WebElement uname;

	@FindBy(id = "txtPassword")
	private WebElement pass;

	@FindBy(id = "btnLogin")
	private WebElement loginbutton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validateuserIsdisplayOrNot() {
		return uname.isDisplayed();
	}

	public void enterusername(String username) {
		uname.sendKeys(username);
	}

	public boolean validatepasswordIsdisplayOrNot() {
		return pass.isDisplayed();
	}

	public void enterpassword(String password) {
		pass.sendKeys(password);
	}

	public void clickloginbuttom() {
		loginbutton.click();
	
	}
}
