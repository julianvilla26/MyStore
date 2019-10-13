package co.com.sofka.certificacion.mystore.interactions;

import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreShop.WOMEN_OPTION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectWomen implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(WOMEN_OPTION));
	}

	public static SelectWomen option() {
		return Tasks.instrumented(SelectWomen.class);
	}
}
