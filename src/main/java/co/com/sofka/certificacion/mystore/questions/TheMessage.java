package co.com.sofka.certificacion.mystore.questions;

import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreForm.MESSAGE_TO_WELCOME;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheMessage implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(MESSAGE_TO_WELCOME).viewedBy(actor).asString();
	}

	public static TheMessage forTheUser() {
		return new TheMessage();
	}
}
