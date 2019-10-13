package co.com.sofka.certificacion.mystore.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Wait implements Interaction{

	private int time;
	
	public Wait(int time) {
		this.time = time;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		new InternalSystemClock().pauseFor(time);;
	}

	public static Wait time(int time) {
		return Tasks.instrumented(Wait.class, time);
	}
}
