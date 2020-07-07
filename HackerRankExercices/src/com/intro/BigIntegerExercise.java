package com.intro;
/*
In this problem, you have to add and multiply huge numbers! These numbers are so big that
you can't contain them in any ordinary data types like a long integer.
Use the power of Java's BigInteger class and solve this problem.
 */

import java.util.*;
import java.math.*;

public class BigIntegerExercise {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter two big numbers: ");
        BigInteger a = new BigInteger(scan.next());
        BigInteger b = new BigInteger(scan.next());
        scan.close();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

    }
}
