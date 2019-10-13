package co.com.sofka.certificacion.mystore.tasks;


import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreForm.ADDRESS_FORM;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreForm.ADDRESS_REFERENCE_FORM;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreForm.COMPANY_ADDRESS2;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreForm.COMPANY_NAME_ADDRESS;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreForm.COUNTRY_FORM;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreForm.DAY_OF_THE_BIRTHDAY;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreForm.FIRST_NAME_ADDRESS;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreForm.FIRST_NAME_FORM;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreForm.LAST_NAME_ADDRESS;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreForm.LAST_NAME_FORM;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreForm.MOBILE_PHONE_FORM;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreForm.MONTH_OF_THE_BIRTHDAY;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreForm.PASSWORD_FORM;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreForm.POSTAL_CODE_FORM;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreForm.REGISTER_USER_FORM;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreForm.SPECIAL_OFFERS;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreForm.STATE_FORM;
import static co.com.sofka.certificacion.mystore.userinterfaces.MyStoreForm.YEAR_OF_THE_BIRTHDAY;

import java.io.IOException;
import java.util.List;

import co.com.sofka.certificacion.mystore.interactions.ClickOnCreate;
import co.com.sofka.certificacion.mystore.interactions.SingIn;
import co.com.sofka.certificacion.mystore.models.UsersRegister;
import co.com.sofka.certificacion.mystore.userinterfaces.MyStoreForm;
import co.com.sofka.certificacion.mystore.utils.data.Credentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class SendThe implements Task{

	private List<UsersRegister> listUsers;
	private String password;
	Credentials credentials = new Credentials();
	
	public SendThe(List<UsersRegister> listUsers) throws IOException{
		this.password = credentials.getPassword();
		this.listUsers = listUsers;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				SingIn.inMyStore(),
				ClickOnCreate.account(credentials),
				Enter.theValue(listUsers.get(0).getFirstName()).into(FIRST_NAME_FORM),
				Enter.theValue(listUsers.get(0).getLastName()).into(LAST_NAME_FORM),
				Enter.theValue(password).into(PASSWORD_FORM),
				SelectFromOptions.byIndex(listUsers.get(0).getDay()).from(DAY_OF_THE_BIRTHDAY),
				SelectFromOptions.byIndex(listUsers.get(0).getMonth()).from(MONTH_OF_THE_BIRTHDAY),
				SelectFromOptions.byValue(listUsers.get(0).getYear()).from(YEAR_OF_THE_BIRTHDAY),
				Click.on(SPECIAL_OFFERS),
				Enter.theValue(listUsers.get(0).getFirstName()).into(FIRST_NAME_ADDRESS),
				Enter.theValue(listUsers.get(0).getLastName()).into(LAST_NAME_ADDRESS),
				Enter.theValue(listUsers.get(0).getCompany()).into(COMPANY_NAME_ADDRESS),
				Enter.theValue(listUsers.get(0).getAddress()).into(ADDRESS_FORM),
				Enter.theValue(listUsers.get(0).getAddress()).into(COMPANY_ADDRESS2),
				Enter.theValue(listUsers.get(0).getCity()).into(MyStoreForm.CITY_FORM),
				SelectFromOptions.byVisibleText(listUsers.get(0).getState()).from(STATE_FORM),
				Enter.theValue(listUsers.get(0).getPostalCode()).into(POSTAL_CODE_FORM),
				SelectFromOptions.byVisibleText(listUsers.get(0).getCountry()).from(COUNTRY_FORM),
				Enter.theValue(listUsers.get(0).getMobilePhone()).into(MOBILE_PHONE_FORM),
				Enter.theValue(listUsers.get(0).getAddressReference()).into(ADDRESS_REFERENCE_FORM),
				Click.on(REGISTER_USER_FORM));
	}

	public static SendThe infoToTheForm(List<UsersRegister> listUsers) {
		return Tasks.instrumented(SendThe.class, listUsers);
	}
}
