package Com.StepDefination;

import Com.PageLayer.Admin;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminTest {

	public static Admin admin;

	@Then("user click on Admin page link")
	public void user_click_on_admin_page_link() {
		admin = new Admin();
		admin.click_On_Admin_Button();
	}

	@Then("user click on add button in Admin Page")
	public void user_click_on_add_button_in_admin_page() {
		admin.click_On_Add_Button();
	}

	@When("create a new user")
	public void create_a_new_user() {

		admin.select_Dropdoun_value();
		admin.enter_emplyee_Id("datta");
		admin.select_dropdoun_Status("Disabled");
	}

}
