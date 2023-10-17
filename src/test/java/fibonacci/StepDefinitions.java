package fibonacci;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    private int index;
    private int fibonacciValue;
    
    @Given("subscript is {int}")
    public void subscript_is(Integer index) {
        this.index = index;
    }
    
    @When("get the fibonacci value")
    public void get_the_fibonacci_value() {
        fibonacciValue = Fibonacci.getValue(index);
    }
    
    @Then("the fibonacci value is {int}")
    public void the_fibonacci_value_is(Integer value) {
        assertEquals(value, fibonacciValue);
    }
}
