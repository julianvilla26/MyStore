package co.com.sofka.certificacion.mystore.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MyStoreShop {
	
	private MyStoreShop() {
	    throw new IllegalStateException("Class the register of the users");
	  }
	
	public static final String GENERIC_XPATH = "//div[@id='center_column']//p[@class='cart_navigation clearfix']//button";
	
	public static final Target WOMEN_OPTION = Target.the("Women menu, the user can watch diferent types of clothes")
			.locatedBy("//div[@id='block_top_menu']//ul/child::li//a[text()='Women']");
	
	public static final Target DRESSES_MENU = Target.the("Women menu, the user can watch diferent types of dress")
			.locatedBy("//div[@id='categories_block_left']//descendant::span[2]");
	
	public static final Target DRESSES_OPTIONS = Target.the("Select your tipe of the dress")
			.locatedBy("//div[@class='block_content']//descendant::a[contains(text(),'{0}')]");
	
	public static final Target LIST_PRICE_DRESS = Target.the("Select all price of the dress")
			.locatedBy("//ul[@class='product_list grid row']/li/div/div[2]/div/span[@class='price product-price']");
	
	public static final Target DRESS_WITH_HIGHER_PRICE = Target.the("Select dress with the higher price")
			.locatedBy("//div[@class='product-container']//div[@class='right-block']//div//span[@class='price product-price' and contains(text(),'{0}')]");
	
	public static final Target CONFIRM_TOTAL_PRODUCT = Target.the("Confirm the total of the sale")
			.locatedBy("//div[@id='layer_cart']//div//child::div//descendant::div//a");
	
	public static final Target CONFIRM_SUMMARY = Target.the("Confirm the summary of the sale")
			.locatedBy("//div[@id='center_column']//p[@class='cart_navigation clearfix']//a[1]");
	
	public static final Target CONFIRM_ADDRESS = Target.the("Confirm the address of the client")
			.locatedBy(GENERIC_XPATH);
	
	public static final Target CONFIRM_TERMS_OF_SERVICE = Target.the("Confirm the of the service to the client")
			.locatedBy("//div[@class='order_carrier_content box']//p[@class='checkbox']//div");
	
	public static final Target CONFIRM_SHIPPING = Target.the("Confirm the shipping for the client")
			.locatedBy(GENERIC_XPATH);
	
	public static final Target TYPE_OF_PAYMENT = Target.the("Select the type of payment")
			.locatedBy("//div//a[@class='bankwire']");
	
	public static final Target CONFIRM_PAYMENT = Target.the("Confirm the payment")
			.locatedBy(GENERIC_XPATH);
	
	public static final Target MESSAGE_CONFIRM_ORDER = Target.the("Message to confirm the order")
			.locatedBy("//div[@id='center_column']//div//p/strong");
}
