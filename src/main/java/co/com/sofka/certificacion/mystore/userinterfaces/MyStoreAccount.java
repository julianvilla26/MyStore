package co.com.sofka.certificacion.mystore.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MyStoreAccount {
	
	private MyStoreAccount() {
	    throw new IllegalStateException("Class the register of the users");
	  }
	
	public static final Target EMAIL_ADDRESS_CREATE = Target.the("Text area for introducing the email for the register")
			.locatedBy("//input[@id='email_create']");
	
	public static final Target CREATE_ACCOUNT = Target.the("Button from create new account for the user")
			.locatedBy("//button[@id='SubmitCreate']");
	
	public static final Target EMAIL_ADDRESS_REGISTER = Target.the("Text area for introducing the email registred")
			.locatedBy("//input[@id='email']");
	
	public static final Target PASSWORD_ADDRESS_REGISTER = Target.the("Text area for introducing the password registred")
			.locatedBy("//input[@id='passwd']");
	
	public static final Target SING_IN_ACCOUNT = Target.the("Button for the login in the page")
			.locatedBy("//button[@id='SubmitLogin']");
	
	public static final Target ERROR_CREATE_ACCOUNT = Target.the("Error when introducing already exist email")
			.locatedBy("//form[@id='create-account_form']//div//ol//li");
}
