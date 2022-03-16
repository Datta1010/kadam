package Com.StepDefination;

import static org.junit.Assert.assertEquals;

import Com.BaseLayer.BaseClass;
import Com.PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest extends BaseClass {
	public static LoginPage login;

	

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
		login = new LoginPage();
		boolean actualresurt = login.validateuserIsdisplayOrNot();
		assertEquals(true, actualresurt);
		login.enterusername("Admin");
		boolean actualresurts = login.validatepasswordIsdisplayOrNot();
		assertEquals(true, actualresurts);
		login.enterpassword("admin123");
	}

	@Then("user is on home page and verify user is on home page or not?")
	public void user_is_on_home_page_and_verify_user_is_on_home_page_or_not() {
		login.clickloginbuttom();

	}

}
