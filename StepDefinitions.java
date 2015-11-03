import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

class StepDefinitions { 
  int celsius = -1; 
  int fahrenheit = -1; 
  @Given("^Celsius is (\\d+)$")
  public void celsius_is(int arg1) throws Throwable {
    celsius = arg1; 
  }

  @When("^converted to Fahrenheit$")
  public void converted_to_Fahrenheit() throws Throwable {
    fahrenheit = Temperature.convertCelsiusToFahrenheit(celsius); 
  }

  @Then("^result is (\\d+)$")
  public void result_is(int arg1) throws Throwable {
    assertEquals(arg1, fahrenheit); 
  }
}