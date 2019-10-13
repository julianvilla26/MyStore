package co.com.sofka.certificacion.mystore.questions;

import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreAccount.ERROR_CREATE_ACCOUNT;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheExpected implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(ERROR_CREATE_ACCOUNT).viewedBy(actor).asString();
	}

	public static TheExpected message() {
		return new TheExpected();
	}
}
