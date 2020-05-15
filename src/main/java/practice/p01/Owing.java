package practice.p01;

import java.util.*;

public class Owing {
    private Vector orders;
    private String name;

    public Owing(Vector<Order> orders, String name) {
        this.orders = orders;
        this.name = name;
    }

    void printOwing() {
        double amount = 0.0;
        Enumeration e = orders.elements();

        printBanner();

        //calculate amount
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            amount += each.getAmount();
        }

        //print detail
        System.out.println("name:" + name);
        System.out.println("total:" + amount);
    }

    private void printBanner() {
        System.out.println("**************************");
        System.out.println("***** Customer Owes ******");
        System.out.println("**************************");
    }
}
