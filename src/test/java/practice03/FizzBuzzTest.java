package practice03;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FizzBuzzTest {
    private NumberPrinter printer = new NumberPrinter();

    @Test
    public void should_return_num_when_print() {
        assertTrue("1".equals(printer.print(1)));
    }

    @Test
    public void should_return_fizz_when_multiples_of_three() {
        assertTrue("Fizz".equals(printer.print(3)));
        assertTrue("Fizz".equals(printer.print(6)));
        assertTrue("Fizz".equals(printer.print(9)));
    }

    @Test
    public void should_return_buzz_when_multiples_of_five() {
        assertTrue("Buzz".equals(printer.print(5)));
        assertTrue("Buzz".equals(printer.print(10)));
        assertTrue("Buzz".equals(printer.print(20)));
    }

    @Test
    public void should_return_fizzbuzz_when_multiples_of_three_and_five() {
        assertTrue("FizzBuzz".equals(printer.print(15)));
        assertTrue("FizzBuzz".equals(printer.print(30)));
        assertTrue("FizzBuzz".equals(printer.print(45)));
    }
}
