package co.com.sofka.certificacion.mystore.tasks;

import java.io.IOException;

import co.com.sofka.certificacion.mystore.interactions.ClickOnCreate;
import co.com.sofka.certificacion.mystore.interactions.SingIn;
import co.com.sofka.certificacion.mystore.interactions.Wait;
import co.com.sofka.certificacion.mystore.utils.data.Credentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class EnterThe implements Task{
	
	Credentials credential;
	
	public EnterThe() throws IOException{
		credential = new Credentials();
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				SingIn.inMyStore(),
				ClickOnCreate.account(credential),
				Wait.time(5000));
	}

	public static EnterThe email() {
		return Tasks.instrumented(EnterThe.class);
	}
}
