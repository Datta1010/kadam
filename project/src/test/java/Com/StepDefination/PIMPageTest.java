package Com.StepDefination;

import Com.PageLayer.PIM_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMPageTest {

	public static PIM_Page pimpage;

	@Then("user click on PIM Link")
	public void user_click_on_pim_link() {
		pimpage = new PIM_Page();
		pimpage.Click_On_Pim();
	}

	@Then("user click on Add button in PIM Page")
	public void user_click_on_add_button_in_pim_page() {
		pimpage.Click_On_AddButton();

	}

	@When("user enter personal Details in PIM Page add employee Functionality")
	public void user_enter_personal_details_in_pim_page_add_employee_functionality() {
		pimpage.Enter_Username_In_personl();
		pimpage.Enter_Lastname_In_Personl();

	}

	@Then("user fillup more personal details in PIM page Personal Details Functionality")
	public void user_fillup_more_personal_details_in_pim_page_personal_details_functionality() {
		pimpage.Click_On_Save_Button();
	}

}
