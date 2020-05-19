package practice01;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Owing {
    private Vector orders;
    private String name;

    public Owing(Vector<Order> orders, String name) {
        this.orders = orders;
        this.name = name;
    }

    public String printOwing() {
        StringBuilder result = new StringBuilder();
        double amount = 0.0;
        Enumeration e = orders.elements();

        String banner = printBanner();
        result.append(banner);

        //calculate amount
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            amount += each.getAmount();
        }

        //print detail
        result.append("name:" + name);
        result.append("total:" + amount * (1 + 0.1));
        result.append("date:" + new Date());

        return result.toString();
    }

    private String  printBanner() {
        StringBuilder banner = new StringBuilder();
        banner.append("**************************");
        banner.append("***** Customer Owes ******");
        banner.append("**************************");
        return banner.toString();
    }
}
