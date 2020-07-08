package com.strings;
/*
Given a string, s, matching the regular expression [A-Za-z !,?._'@]+,
split the string into tokens. We define a token to be one or more consecutive English alphabetic letters.
Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.
 */
import java.util.*;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        if (!s.matches("[\t ]+")){
            s=s.trim();
            String[] partidos;
            partidos=s.split("[ !,?._@']+");
            System.out.println(partidos.length);
            for(int i=0;i<partidos.length;i++){
                System.out.println(partidos[i]);
            }
        }else{
            System.out.println("0");
        }

        scan.close();
    }
}
