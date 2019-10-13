package co.com.sofka.certificacion.mystore.stepdefinitions;

import static co.com.sofka.certificacion.mystore.exceptions.TheMessageIs.MESSAGE_ERROR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

import java.util.List;

import co.com.sofka.certificacion.mystore.exceptions.TheMessageIs;
import co.com.sofka.certificacion.mystore.questions.TheMessageTo;
import co.com.sofka.certificacion.mystore.tasks.SelectThe;
import co.com.sofka.certificacion.mystore.tasks.LoginIn;
import co.com.sofka.certificacion.mystore.utils.drivers.DriverWeb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class BuyProductStepDefinitions {
	
	private static final String URL = "http://automationpractice.com/index.php";
	
	@Given("^I am logged in on the website$")
	public void iAmLoggedInOnTheWebsite() {
		theActorInTheSpotlight().can(BrowseTheWeb.with(DriverWeb.andEnterThe(URL)));
	}

	@When("^I was buy a dress$")
	public void iWasBuyADress() {
		theActorInTheSpotlight().attemptsTo(
				LoginIn.theWebSite(),
				SelectThe.dressToBuy());
	}

	@Then("^I verify that the buy is successful$")
	public void iVerifyThatTheBuyIsSuccessful(List<String> confirmOrder) {
		theActorInTheSpotlight().should(
				seeThat(TheMessageTo.theClient(), is(confirmOrder.get(0)))
				.orComplainWith(TheMessageIs.class, MESSAGE_ERROR));
		Serenity.takeScreenshot();
	}
}
