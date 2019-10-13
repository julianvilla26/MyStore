package co.com.sofka.certificacion.mystore.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MyStoreHome {

	private MyStoreHome() {
	    throw new IllegalStateException("Class the register of the users");
	  }
	
	public static final Target SING_IN = Target.the("Button for the register of the users")
			.locatedBy("//div[@class='header_user_info']");
}
