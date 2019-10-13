package co.com.sofka.certificacion.mystore.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MyStoreForm {

	private MyStoreForm() {
	    throw new IllegalStateException("Class the register of the users");
	  }
	
	public static final Target FIRST_NAME_FORM = Target.the("Text area for introducing the first name of the user")
			.locatedBy("//input[@id='customer_firstname']");
	
	public static final Target LAST_NAME_FORM = Target.the("Text area for introducing the last name of the user")
			.locatedBy("//input[@id='customer_lastname']");
	
	public static final Target PASSWORD_FORM = Target.the("Text area for introducing the password of the user")
			.locatedBy("//input[@id='passwd']");
	
	public static final Target DAY_OF_THE_BIRTHDAY = Target.the("Dropdown for select the day of the birthday user")
			.locatedBy("//select[@id='days']");
	
	public static final Target MONTH_OF_THE_BIRTHDAY = Target.the("Dropdown for select the month of the birthday user")
			.locatedBy("//select[@id='months']");
	
	public static final Target YEAR_OF_THE_BIRTHDAY = Target.the("Dropdown for select the year of the birthday user")
			.locatedBy("//select[@id='years']");
	
	public static final Target SPECIAL_OFFERS = Target.the("Send special offers for the user by email")
			.locatedBy("//input[@id='optin']");
	
	public static final Target FIRST_NAME_ADDRESS = Target.the("Text area for introducing the first name of the user")
			.locatedBy("//input[@id='firstname']");
	
	public static final Target LAST_NAME_ADDRESS = Target.the("Text area for introducing the last name of the user")
			.locatedBy("//input[@id='lastname']");
	
	public static final Target COMPANY_NAME_ADDRESS = Target.the("Text area for introducing the name company of the user")
			.locatedBy("//input[@id='company']");
	
	public static final Target COMPANY_ADDRESS2 = Target.the("Text area for introducing the address company of the user")
			.locatedBy("//input[@id='address2']");
	
	public static final Target ADDRESS_FORM = Target.the("Text area for introducing the address of the user")
			.locatedBy("//input[@id='address1']");
	
	public static final Target CITY_FORM = Target.the("Text area for introducing the city of the user")
			.locatedBy("//input[@id='city']");
	
	public static final Target STATE_FORM = Target.the("Dropdown for select the state of the user")
			.locatedBy("//select[@id='id_state']");
	
	public static final Target POSTAL_CODE_FORM = Target.the("Text area for introducing the postal code of the user")
			.locatedBy("//input[@id='postcode']");
	
	public static final Target COUNTRY_FORM = Target.the("Dropdown for select the country of the user")
			.locatedBy("//select[@id='id_country']");
	
	public static final Target MOBILE_PHONE_FORM = Target.the("Text area for introducing the cell number of the user")
			.locatedBy("//input[@id='phone_mobile']");
	
	public static final Target ADDRESS_REFERENCE_FORM = Target.the("Text area for introducing the reference of the address to the user")
			.locatedBy("//input[@id='alias']");
	
	public static final Target REGISTER_USER_FORM = Target.the("Button for create the account to the user")
			.locatedBy("//button[@id='submitAccount']");
	
	public static final Target MESSAGE_TO_WELCOME = Target.the("Message to welcome for the user")
			.locatedBy("//p[@class='info-account']");
}
