package co.com.sofka.certificacion.mystore.tasks;

import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreAccount.EMAIL_ADDRESS_REGISTER;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreAccount.PASSWORD_ADDRESS_REGISTER;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreAccount.SING_IN_ACCOUNT;

import java.io.IOException;

import co.com.sofka.certificacion.mystore.interactions.SingIn;
import co.com.sofka.certificacion.mystore.utils.data.Credentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginIn implements Task{

	private String email;
	private String password;
	Credentials credentials = new Credentials();
	
	public LoginIn() throws IOException{
		this.email=credentials.getEmail();
		this.password=credentials.getPassword();
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				SingIn.inMyStore(),
				Enter.theValue(email).into(EMAIL_ADDRESS_REGISTER),
				Enter.theValue(password).into(PASSWORD_ADDRESS_REGISTER),
				Click.on(SING_IN_ACCOUNT));
	}

	public static LoginIn theWebSite() {
		return Tasks.instrumented(LoginIn.class);
	}
}
