package com.bigintegers;
/*
Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!
Given an array, s, of n real number strings, sort them in descending order — but wait, there's more! Each number must
be printed in the exact same format as it was read from stdin, meaning that .1 is printed as .1, and 0.1 is printed as
0.1.
If two numbers represent numerically equivalent values (e.g., .1===0.1), then they must be listed in the same order as
they were received as input).

Complete the code in the unlocked section of the editor below. You must rearrange array s's elements according to
the instructions above.

Input Format

The first line consists of a single integer, , denoting the number of integer strings.
Each line  of the  subsequent lines contains a real number denoting the value of .
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class JBigDecimal {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        BigDecimal x,y;
        String aux;
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                x=new BigDecimal(s[j]);
                y=new BigDecimal(s[j+1]);

                if(x.compareTo(y)<0){
                    aux=s[j];
                    s[j]=s[j+1];
                    s[j+1]=aux;
                }
            }
        }


        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
