package co.com.sofka.certificacion.mystore.tasks;

import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThe implements Task{

	private WebDriver chrome;
	private String url;
	
	public OpenThe(WebDriver chrome) {
		this.chrome = chrome;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.can(BrowseTheWeb.with(chrome));
		actor.attemptsTo(Open.url(url));
	}
	
	public static OpenThe browser(WebDriver chrome) {
		return Tasks.instrumented(OpenThe.class, chrome);
	}
	
	public OpenThe andThenEnterTheUrl(String url) {
		this.url = url;
		return this;
	}
}
