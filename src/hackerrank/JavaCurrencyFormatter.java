package hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

// From: hackerrank.com/challenges/java-currency-formatter/problem

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double payment = sc.nextDouble();

        Locale.setDefault(Locale.US);
        NumberFormat nfUs = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nfIndia = NumberFormat.getCurrencyInstance(new Locale ("en", "in"));
        NumberFormat nfChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nfFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us = nfUs.format(payment);
        String india = nfIndia.format(payment);
        String china = nfChina.format(payment);
        String france = nfFrance.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);


        sc.close();
    }
}
