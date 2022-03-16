package Com.StepDefination;

import Com.PageLayer.My_Info_Page;
import io.cucumber.java.en.When;

public class My_Infotest {
	public static My_Info_Page myinfo;

	@When("user click on my info page")
	public void user_click_on_my_info_page() {

		myinfo = new My_Info_Page();
		myinfo.click_On_Admin();

	}
}