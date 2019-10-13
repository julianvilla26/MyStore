package co.com.sofka.certificacion.mystore.questions;

import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreShop.MESSAGE_CONFIRM_ORDER;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheMessageTo implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		
		return Text.of(MESSAGE_CONFIRM_ORDER).viewedBy(actor).asString();
	}

	public static TheMessageTo theClient() {
		return new TheMessageTo();
	}
}
