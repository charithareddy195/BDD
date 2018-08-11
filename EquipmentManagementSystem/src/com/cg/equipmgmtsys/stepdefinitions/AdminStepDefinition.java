package com.cg.equipmgmtsys.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminStepDefinition {
	private WebDriver driver;
	private boolean flag=false;
	
	@Before(order=1)
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@When("^admin is logged in$")
	public void admin_is_logged_in() throws Throwable {
		Assert.assertEquals("www.equipmgmtsys.com/admin", driver.getCurrentUrl());
	}

	@Then("^admin can do Allocate, update, move and list of the equipment$")
	public void admin_can_do_Allocate_update_move_and_list_of_the_equipment() throws Throwable {
	    String pSource = driver.getPageSource();
	    if(pSource.contains("allocate")&& pSource.contains("update") && pSource.contains("move") && pSource.contains("Query all equipments") && pSource.contains("Query by fields"))
	    {
	    	flag = true;
	    }
	    	Assert.assertEquals(true, flag);
	}

	@When("^admin clicks on allocate$")
	public void admin_clicks_on_allocate() throws Throwable {
		Assert.assertEquals("www.equipmgmtsys.com/admin/allocate", driver.getCurrentUrl());
	}

	@When("^admins location and equipment location are same$")
	public void admins_location_and_equipment_location_are_same() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^admin can get equipment_tag, set the user_id for equipment table, update equipment_status$")
	public void admin_can_get_equipment_tag_set_the_user_id_for_equipment_table_update_equipment_status() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Admin clicks on update single equipment$")
	public void admin_clicks_on_update_single_equipment() throws Throwable {
		Assert.assertEquals("www.equipmgmtsys.com/admin/updateSingle", driver.getCurrentUrl());
	}

	@When("^enters the equipment primary key clicks on submit$")
	public void enters_the_equipment_primary_key_clicks_on_submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^the equipment has the same location as that of the user$")
	public void the_equipment_has_the_same_location_as_that_of_the_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^If the equipment has been retired$")
	public void if_the_equipment_has_been_retired() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^allow admin to only update the comments$")
	public void allow_admin_to_only_update_the_comments() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^If the equipment has status in stock$")
	public void if_the_equipment_has_status_in_stock() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^is not retired$")
	public void is_not_retired() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	/*@Then("^the equipment has the same location as that of the user$")
	public void the_equipment_has_the_same_location_as_that_of_the_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}*/

	@Then("^allow admin to update the following fields Purchase Method, Seq Number, cost center, location, audit indicator\\(yes/no\\),audit date, comments,stock location$")
	public void allow_admin_to_update_the_following_fields_Purchase_Method_Seq_Number_cost_center_location_audit_indicator_yes_no_audit_date_comments_stock_location() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^default fields should be user id, dept id,install date to null and useStatus to inStock$")
	public void default_fields_should_be_user_id_dept_id_install_date_to_null_and_useStatus_to_inStock() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the equipment has the same location as that of the user who is logged in$")
	public void the_equipment_has_the_same_location_as_that_of_the_user_who_is_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^If the equipment has status in use$")
	public void if_the_equipment_has_status_in_use() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^allow admin to update the following fields Purchase Method, Seq Number, userid, deptid, cost center, location, audit indicator\\(yes/no\\),audit date, comments$")
	public void allow_admin_to_update_the_following_fields_Purchase_Method_Seq_Number_userid_deptid_cost_center_location_audit_indicator_yes_no_audit_date_comments() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^default fields useStatus to inUse$")
	public void default_fields_useStatus_to_inUse() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^admin user clicks on view all equipments button$")
	public void admin_user_clicks_on_view_all_equipments_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^admin selects move$")
	public void admin_selects_move() throws Throwable {
		Assert.assertEquals("www.equipmgmtsys.com/admin/move", driver.getCurrentUrl());
	}

	@Then("^admin can get the user_id, equipment_tag, update equipment_status$")
	public void admin_can_get_the_user_id_equipment_tag_update_equipment_status() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^admin selects query by value and clicks on get list$")
	public void admin_selects_query_by_value_and_clicks_on_get_list() throws Throwable {
		Assert.assertEquals("www.equipmgmtsys.com/admin/allocate", driver.getCurrentUrl());                
	}

	@Then("^admin can get the list using equipment_tag or sequence_number or machine_id or location or user_id$")
	public void admin_can_get_the_list_using_equipment_tag_or_sequence_number_or_machine_id_or_location_or_user_id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
