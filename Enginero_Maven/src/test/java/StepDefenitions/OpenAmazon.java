package StepDefenitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.*;
public class OpenAmazon {

	

@Given("user is entering amazon website")
public void user_is_entering_amazon_website() {
    System.out.println("amazon");
   
}

@When("user search mobiles")
public void user_search_mobiles(DataTable dataTable) {
    
	List<String> list=dataTable.asList(String.class);
	System.out.println(list.get(0));
	System.out.println(list.get(1));
}

@Then("the user should see the results of mobile")
public void the_user_should_see_the_results_of_mobile() {
    // Write code here that turns the phrase above into concrete actions
    
}
}
