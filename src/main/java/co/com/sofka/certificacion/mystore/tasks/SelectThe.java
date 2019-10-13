package co.com.sofka.certificacion.mystore.tasks;

import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreShop.CONFIRM_ADDRESS;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreShop.CONFIRM_PAYMENT;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreShop.CONFIRM_SHIPPING;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreShop.CONFIRM_SUMMARY;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreShop.CONFIRM_TERMS_OF_SERVICE;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreShop.CONFIRM_TOTAL_PRODUCT;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreShop.DRESSES_MENU;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreShop.DRESSES_OPTIONS;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreShop.LIST_PRICE_DRESS;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreShop.TYPE_OF_PAYMENT;

import java.io.IOException;
import java.util.List;

import co.com.sofka.certificacion.mystore.interactions.CalculateThe;
import co.com.sofka.certificacion.mystore.interactions.SelectWomen;
import co.com.sofka.certificacion.mystore.utils.data.Credentials;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectThe implements Task{

	private String optionDress;
	List<WebElementFacade> priceDress;
	Credentials credentials = new Credentials();
	
	public SelectThe() throws IOException{
		this.optionDress = credentials.getOptionDress();
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				SelectWomen.option(),
				Click.on(DRESSES_MENU),
				Click.on(DRESSES_OPTIONS.of(optionDress)));
		
		priceDress = LIST_PRICE_DRESS.resolveAllFor(actor);
		
		actor.attemptsTo(
				CalculateThe.highPrice(priceDress),
				Click.on(CONFIRM_TOTAL_PRODUCT),
				Click.on(CONFIRM_SUMMARY),
				Click.on(CONFIRM_ADDRESS),
				Click.on(CONFIRM_TERMS_OF_SERVICE),
				Click.on(CONFIRM_SHIPPING),
				Click.on(TYPE_OF_PAYMENT),
				Click.on(CONFIRM_PAYMENT));
	}

	public static SelectThe dressToBuy() {
		return Tasks.instrumented(SelectThe.class);
	}
}
