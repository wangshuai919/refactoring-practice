package practice03;

import java.util.ArrayList;
import java.util.List;

public class NumberPrinter {

    private String convert(int num) {
        String value = fizz(num) + buzz(num) + whizz(num);
        return value.length() > 0 ? value : String.valueOf(num);
    }

    private String fizz(int num) {
        return num % 3 == 0 ? "Fizz" : "";
    }
    private String buzz(int num) {
        return num % 5 == 0 ? "Buzz" : "";
    }
    private String whizz(int num) {
        return num % 7 == 0 ? "Whizz" : "";
    }

    public List convertNumber() {
        List<String> result = new ArrayList<String>();
        for (int i = 1; i <= 100; i++) {
            System.out.println(convert(i));
            result.add(convert(i));
        }
        return result;
    }
}
