package com.strings;
/*
Write a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign it
to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address:

IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.
Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.

In this problem you will be provided strings containing any combination of ASCII characters.
You have to write a regular expression to find the valid IPs.
Just write the MyRegex class which contains a String pattern. The string should contain the correct regular expression.

(MyRegex class MUST NOT be public)
 */
import java.util.Scanner;

public class IPValidator {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            new MyRegex();
            System.out.println(IP.matches(MyRegex.pattern));
        }
    }
}
class MyRegex{

    public static final String zeroTo255="([0-9]{1,2}|[0-1][0-9]{2}|2[0-4][0-9]|25[0-5])";
    public static final String pattern=zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
}
