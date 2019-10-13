package co.com.sofka.certificacion.mystore.stepdefinitions;

import static co.com.sofka.certificacion.mystore.exceptions.TheMessageIs.MESSAGE_ERROR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

import java.util.List;

import co.com.sofka.certificacion.mystore.exceptions.TheMessageIs;
import co.com.sofka.certificacion.mystore.models.UsersRegister;
import co.com.sofka.certificacion.mystore.questions.TheExpected;
import co.com.sofka.certificacion.mystore.questions.TheMessage;
import co.com.sofka.certificacion.mystore.tasks.EnterThe;
import co.com.sofka.certificacion.mystore.tasks.SendThe;
import co.com.sofka.certificacion.mystore.utils.drivers.DriverWeb;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CreateUserStepdefinition {
	
	private static final String URL = "http://automationpractice.com/index.php";
	
	@Before
	public void before() {
		setTheStage(new OnlineCast());
		theActorCalled("julian");
	}
	
	@Given("^I am on the page$")
	public void iAmOnThePage() {
		theActorInTheSpotlight().can(BrowseTheWeb.with(DriverWeb.andEnterThe(URL)));
	}


	@When("^I create the account$")
	public void iCreateTheAccount(List<UsersRegister> listUsers) {
		theActorInTheSpotlight().attemptsTo(SendThe.infoToTheForm(listUsers));
	}

	@Then("^I verify that the account was create successful$")
	public void iVerifyThatTheAccountWasCreateSuccessful(List<String> welcome) {
		theActorInTheSpotlight().should(
	    		seeThat(TheMessage.forTheUser(), is(welcome.get(0)))
	    		.orComplainWith(TheMessageIs.class, MESSAGE_ERROR));
	    Serenity.takeScreenshot();
	}
	
	@When("^I register the mail$")
	public void iRegisterTheMail() {
		theActorInTheSpotlight().attemptsTo(EnterThe.email());
	}

	@Then("^I verify that the account was not create successful$")
	public void iVerifyThatTheAccountWasNotCreateSuccessful(List<String> emailAlreadyExist) {
		theActorInTheSpotlight().should(
				seeThat(TheExpected.message(), is(emailAlreadyExist.get(0)))
				.orComplainWith(TheMessageIs.class, MESSAGE_ERROR));
		Serenity.takeScreenshot();
	}
}
