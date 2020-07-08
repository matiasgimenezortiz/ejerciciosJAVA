package com.strings;
/*
Given a string, s, and an integer, k, complete the function so that it finds
the lexicographically smallest and largest substrings of length .
 */


import java.util.Scanner;
public class SubStringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] vector = new String[s.length()-k+1];

        for (int i=0;i<vector.length;i++){
            vector[i]=(s.substring(i,i+k));
        }

        smallest=vector[0];
        largest=vector[0];

        for (int i=0;i<vector.length;i++){
            if (vector[i].compareTo(smallest)<0){
                smallest=vector[i];
            }
            if (vector[i].compareTo(largest)>0){
                largest=vector[i];
            }
        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
