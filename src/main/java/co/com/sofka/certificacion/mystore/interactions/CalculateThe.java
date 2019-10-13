package co.com.sofka.certificacion.mystore.interactions;

import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreShop.DRESS_WITH_HIGHER_PRICE;

import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class CalculateThe implements Interaction{
	
	private double mayor=0;
	private double aux=0;
	private List<WebElementFacade> price;
	
	public CalculateThe(List<WebElementFacade> price) {
		this.price = price;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		for(WebElementFacade w: price) {
			aux = Double.parseDouble(w.getText().replace("$", " "));
			if(aux>mayor) {
				mayor = aux;
			}
		}
		
		actor.attemptsTo(
				Click.on(DRESS_WITH_HIGHER_PRICE.of(Double.toString(mayor))),
				Wait.time(5000));
	}
	
	public static CalculateThe highPrice(List<WebElementFacade> price) {
		return Tasks.instrumented(CalculateThe.class, price);
	}
}
