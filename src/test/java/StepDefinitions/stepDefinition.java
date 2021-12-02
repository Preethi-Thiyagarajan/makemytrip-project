package StepDefinitions;


	import java.util.Map;

	import Pages.HomePage;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class stepDefinition {
		Pages.HomePage homePage;
		@Given("I am on makemytrip page")
		public void i_am_on_makemytrip_page() {
		    homePage.launchApplication();
		}
		
		@When("I perform one way search")
		public void perform_one_way_search(Map<String, String> flightDetails) {
			homePage.oneWayTrip(flightDetails);
		}
		
		@Then("search results should display available flights")
		public void search_results_should_display_available_flights() {
		    homePage.clickOnSearch();
		}

	}

