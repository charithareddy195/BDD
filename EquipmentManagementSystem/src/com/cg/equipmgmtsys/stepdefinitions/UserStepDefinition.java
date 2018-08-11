package com.cg.equipmgmtsys.stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserStepDefinition {
	
	private WebDriver driver;
	private boolean flag=false;
	@Before(order=1)
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Given("^User wants to login to equipment tracking system application$")
	public void user_wants_to_login_to_equipment_tracking_system_application() throws Throwable {
		driver.get("www.equipmgmtsys.com/");
		driver.findElement(By.id("login")).click();
	}

	@When("^User enter invalid user credentials$")
	public void user_enter_invalid_user_credentials() throws Throwable {
	    driver.findElement(By.id("user_id")).sendKeys("100976805");
	    driver.findElement(By.id("password")).sendKeys("10097xcg6805");
	    By elements=By.name("user_type");
		List<WebElement> radioButtons=driver.findElements(elements);
		WebElement radioBtn=radioButtons.get(1);
		radioBtn.click();
		//radioButtons.get(2).click();
//		for(WebElement radioButton:radioButtons) {
//			if(radioButton.isSelected())
//				System.out.println(radioButton.getAttribute("value"));
//		}
		if(driver.findElement(By.id("user_id")).equals(1001) && driver.findElement(By.id("password")).equals("admin"))
		{
			flag=true;
		}
		Assert.assertEquals(false, flag);
	}

	@Then("^display the authentication error page$")
	public void display_the_authentication_error_page() throws Throwable {
	   
	    //need to be implemented
		
	}

	@When("^User enters the valid user credentials$")
	public void user_enters_the_valid_user_credentials() throws Throwable {
		
		driver.findElement(By.id("user_id")).sendKeys("1001");
	    driver.findElement(By.id("password")).sendKeys("admin");
	    By elements=By.name("user_type");
		List<WebElement> radioButtons=driver.findElements(elements);
		WebElement radioBtn=radioButtons.get(1);
		radioBtn.click();
		//radioButtons.get(2).click();
//		for(WebElement radioButton:radioButtons) {
//			if(radioButton.isSelected())
//				System.out.println(radioButton.getAttribute("value"));
//		}
		if(driver.findElement(By.id("user_id")).equals(1001) && driver.findElement(By.id("password")).equals("admin"))
		{
			flag=true;
		}
		Assert.assertEquals(true, flag);
	}

	@Then("^User will be able to access the application$")
	public void user_will_be_able_to_access_the_application() throws Throwable {
		driver.findElement(By.id("submit")).click();
	}

	@When("^User is logged in and does not have admin rights$")
	public void user_is_logged_in_and_does_not_have_admin_rights() throws Throwable {
	   Assert.assertEquals("www.equipmgmtsys.com/user", driver.getCurrentUrl());
	}
	
	@Then("^display query by field and query all equipments options$")
	public void display_query_by_field_and_query_all_equipments_options() throws Throwable {
	    String pSource = driver.getPageSource();
	    if(pSource.contains("Query all equipments") && pSource.contains("Query by fields"))
	    {
	    	flag = true;
	    }
	    Assert.assertEquals(true, flag);
	}

	@When("^regular user clicks on view all equipments button$")
	public void regular_user_clicks_on_view_all_equipments_button() throws Throwable {
		driver.findElement(By.id("viewAll")).click();
	}

	@Then("^display a table containing equipment details like equipment tag, quantity of equipment, seq no, location of equipment, user id and equipment type$")
	public void display_a_table_containing_equipment_details_like_equipment_tag_quantity_of_equipment_seq_no_location_of_equipment_user_id_and_equipment_type() throws Throwable {
		Assert.assertEquals("www.equipmgmtsys.com/user/viewAll", driver.getCurrentUrl());
	}

	@When("^regular user clicks on get list$")
	public void regular_user_clicks_on_get_list() throws Throwable {
		driver.findElement(By.id("query")).click();
	}

	@Then("^regular user can get the list using equipment_tag or sequence_number or machine_id or location or user_id$")
	public void regular_user_can_get_the_list_using_equipment_tag_or_sequence_number_or_machine_id_or_location_or_user_id() throws Throwable {
		Assert.assertEquals("www.equipmgmtsys.com/user/query", driver.getCurrentUrl());
	}

	@When("^User clicks the logout button$")
	public void user_clicks_the_logout_button() throws Throwable {
		driver.findElement(By.id("logout")).click();
	}

	@Then("^display home page$")
	public void display_home_page() throws Throwable {
		Assert.assertEquals("www.equipmgmtsys.com/", driver.getCurrentUrl());
	}

}
