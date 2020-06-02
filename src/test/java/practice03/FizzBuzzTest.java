package practice03;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FizzBuzzTest {
    private NumberPrinter printer = new NumberPrinter();

    @Test
    public void should_return_num_when_print() {
        assertTrue("1".equals(printer.convertNumber().get(0)));
    }

    @Test
    public void should_return_fizz_when_multiples_of_three() {
        assertTrue("Fizz".equals(printer.convertNumber().get(2)));
        assertTrue("Fizz".equals(printer.convertNumber().get(5)));
        assertTrue("Fizz".equals(printer.convertNumber().get(8)));
    }

    @Test
    public void should_return_buzz_when_multiples_of_five() {
        assertTrue("Buzz".equals(printer.convertNumber().get(4)));
        assertTrue("Buzz".equals(printer.convertNumber().get(9)));
        assertTrue("Buzz".equals(printer.convertNumber().get(19)));
    }

    @Test
    public void should_return_fizz_buzz_when_multiples_of_three_and_five() {
        assertTrue("FizzBuzz".equals(printer.convertNumber().get(14)));
        assertTrue("FizzBuzz".equals(printer.convertNumber().get(29)));
        assertTrue("FizzBuzz".equals(printer.convertNumber().get(44)));
    }

    @Test
    public void should_return_fizz_buzz_whizz_when_multiples_of_three_and_five() {
        assertTrue("Whizz".equals(printer.convertNumber().get(6)));
        assertTrue("FizzWhizz".equals(printer.convertNumber().get(20)));
        assertTrue("BuzzWhizz".equals(printer.convertNumber().get(34)));
    }
}
