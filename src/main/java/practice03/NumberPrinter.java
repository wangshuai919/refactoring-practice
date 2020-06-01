package practice03;

import java.util.ArrayList;
import java.util.List;

public class NumberPrinter {

    public String convert(int num) {
        if (num % 5 == 0 && num % 3 == 0) {
            return "FizzBuzz";
        }
        if (num % 5 == 0) {
            return "Buzz";
        }
        if (num % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(num);
    }

    public List convertNumber() {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            System.out.println(convert(i));
            result.add(convert(i));
        }
        return result;
    }
}
