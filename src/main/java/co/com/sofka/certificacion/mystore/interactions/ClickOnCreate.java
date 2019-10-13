package co.com.sofka.certificacion.mystore.interactions;

import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreAccount.CREATE_ACCOUNT;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreAccount.EMAIL_ADDRESS_CREATE;

import java.io.IOException;

import co.com.sofka.certificacion.mystore.utils.data.Credentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ClickOnCreate implements Interaction{

	private Credentials credentials = new Credentials();
	
	public ClickOnCreate(Credentials credentials) throws IOException{
		this.credentials = credentials;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(credentials.getEmail()).into(EMAIL_ADDRESS_CREATE),
				Click.on(CREATE_ACCOUNT));
	}

	public static ClickOnCreate account(Credentials credentials) {
		return Tasks.instrumented(ClickOnCreate.class, credentials);
	}
}
