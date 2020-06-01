package practice03;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FizzBuzzTest {
    @Test
    public void should_return_num_when_print() {
        NumberPrinter printer = new NumberPrinter();
        assertTrue("1".equals(printer.print(1)));
    }

    @Test
    public void should_return_fizz_when_multiples_of_three() {

    }
}
