package co.com.sofka.certificacion.mystore.interactions;



import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreHome.SING_IN;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SingIn implements Interaction{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SING_IN));
	}

	public static SingIn inMyStore() {
		return Tasks.instrumented(SingIn.class);
	}
}
