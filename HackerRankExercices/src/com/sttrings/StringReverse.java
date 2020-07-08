package com.sttrings;
/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
Given a string A, print Yes if it is a palindrome, print No otherwise.
 */

import java.util.*;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();

        int tamanio = A.length();
        boolean palindromo=false;

        for (int i=0;i<A.length();i++){
            if (A.charAt(i)==(A.charAt(A.length()-i-1))){
                palindromo=true;
            }else{
                palindromo=false;
            }
        }
        if(palindromo){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        /* Enter your code here. Print output to STDOUT. */

    }
}
