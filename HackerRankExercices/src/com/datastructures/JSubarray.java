package com.datastructures;
/*
We define the following:
A subarray of an -element array is an array composed from a contiguous block of the original array's elements.
For example, if array=[1,2,3], then the subarrays are[1], [2], [3], [1,2], [2,3], and[1,2,3].
Something like [1,3] would not be a subarray as it's not a contiguous subsection of the original array.

The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.

Given an array of  integers, find and print its number of negative subarrays on a new line.

Input Format
The first line contains a single integer, n, denoting the length of array Arr=[a0,a1,..,an].
The second line contains n space-separated integers describing each respective element, ai in array Arr.
 */

import java.util.Scanner;

public class JSubarray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        int contador=0,acumulador;

        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                acumulador=0;
                for(int k=i;k<=j;k++){
                    acumulador+=arr[k];
                }
                if (acumulador<0){
                    contador++;
                }
            }

        }
        System.out.println(contador);
    }
}
