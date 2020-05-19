package practice01;

import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class OwingTest {
    @Test
    public void should_return_correct_amount() {
        Order order1 = new Order();
        order1.setAmount(20);
        Order order2 = new Order();
        order2.setAmount(35);

        Vector orders = new Vector();
        orders.add(order1);
        orders.add(order2);

        Owing owing = new Owing(orders, "Mr.Zhang");
        assertThat(owing.printOwing(),
                containsString("total"));
    }

}