package com.sttrings;
/*
The elements of a String are called characters. The number of characters in a String is called the length,
and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters, A and B, perform the following operations:

1-Sum the lengths of  and .
2-Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
3-Capitalize the first letter in  and  and print them on a single line, separated by a space.
 */

import java.io.*;
import java.util.*;

public class StringExcercise1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter two strings: ");
        String A=sc.next();
        String B=sc.next();
        A=A.trim();
        B=B.trim();
        /* Enter your code here. Print output to STDOUT. */
        long sum = A.length()+B.length();
        System.out.println(sum);

        if (A.compareTo(B)<=0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }

        A=A.toUpperCase().substring(0,1)+A.substring(1,A.length()).toLowerCase();
        B=B.toUpperCase().substring(0,1)+B.substring(1,B.length()).toLowerCase();

        System.out.println(A+" "+B);
    }
}
