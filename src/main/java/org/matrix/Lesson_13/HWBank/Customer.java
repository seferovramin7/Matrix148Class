package org.matrix.Lesson_13.HWBank;

import java.util.ArrayList;

public class Customer {
    String name;
    String balance;
    Loan customerLoan;


    public Customer(String name, String balance, Loan customerLoan) {
        this.name = name;
        this.balance = balance;
        this.customerLoan = customerLoan;
    }
}
