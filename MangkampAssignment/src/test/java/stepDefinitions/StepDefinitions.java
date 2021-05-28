package stepDefinitions;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
public String adminName;
public String thlon;
	@Given("I am a sports administrator")
	public void i_am_a_sports_administrator() {
		System.out.println("first");
	}

	@Given("I want to be welcomed")
	public void i_want_to_be_welcomed() {
		System.out.println("Please enter the name of the administrator and press enter to confirm.");
		adminName = "Mupp";
	}

	@When("I click next")
	public void i_click_next() {
		System.out.println("third");
	}

	@Then("I see it welcoming me")
	public void i_see_it_welcoming_me() {
		System.out.println("Welcome " + adminName + " to the athletics score calculator.");
	}

	@Given("I am a administrator")
	public void i_am_a_administrator() {
		System.out.println("first");
	}

	@Given("I select hepathlon")
	public void i_select_hepathlon() {
		System.out.println("Press 1 for Decathlon or 2 for Heptathlon and press enter to confirm.");
	}

	@Given("I enter {int} of contestants")
	public void i_enter_of_contestants(Integer int1) {
		System.out.println("Please enter the number of competitors (1-40) and press enter to confirm.");
	}

	@When("I press next")
	public void i_press_next() {
		System.out.println("fourth");
	}

	@Then("it saves whitch hepathlon and how {int} contestants.")
	public void it_saves_whitch_hepathlon_and_how_contestants(Integer int1) {
		System.out.println("fith");
	}

	@Given("I am event administrator")
	public void i_am_event_administrator() {
		System.out.println("first");
	}

	@Given("I enter contestants name and nationality")
	public void i_enter_contestants_name_and_nationality() {
		System.out.println("Enter the name of competitor x, e.g Davud Mastsson and press enter to confirm.");//x = numret på deltagaren
	}

	@When("I have done that")
	public void i_have_done_that(Integer int1) {
		System.out.println("third");
	}

	@Then("I verify name and nationality")
	public void i_verify_name_and_nationality_verifierar() {
		System.out.println("Please enter the nationality for competitor x, e.g. SWE, and press enter to confirm.");//x = numret på deltagaren
	}

}