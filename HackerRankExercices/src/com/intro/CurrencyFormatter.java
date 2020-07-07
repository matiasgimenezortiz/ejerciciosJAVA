package com.intro;
/*
Given a double-precision number, payment , denoting an amount of money, use the NumberFormat class'
getCurrencyInstance method to convert  into the US, Indian, Chinese, and French currency formats.
Then print the formatted values as follows:

US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the payment value: ");
        double payment = scanner.nextDouble();
        scanner.close();

        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat nus     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nindia  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat nchina  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nfrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us,india,china,france;
        us=nus.format(payment);
        india= nindia.format(payment);
        china=nchina.format(payment);
        france=nfrance.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
