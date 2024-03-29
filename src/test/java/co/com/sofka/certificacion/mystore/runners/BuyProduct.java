package co.com.sofka.certificacion.mystore.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/buy_product.feature",
		glue = "co.com.sofka.certificacion.mystore.stepdefinitions",
		snippets = SnippetType.CAMELCASE)
public class BuyProduct {

}
