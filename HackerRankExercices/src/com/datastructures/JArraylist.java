package com.datastructures;
/*
Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this
problem using Arraylist.
You are given  lines. In each line there are zero or more integers. You need to answer a few queries where
you need to tell the number located in  position of  line.
Take your input from System.in.

Input Format
The first line has an integer n. In each of the next n lines there will be an integer d denoting number of
integers on that line and then there will be d space-separated integers. In the next line there will be an integer  q
denoting number of queries. Each query will consist of two integers x and y.
 */

import java.util.*;

public class JArraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n,d,q,x,y;
        n= scan.nextInt();
        ArrayList[] vector= new ArrayList[n];
        for (int i=0;i<n;i++){
            d=scan.nextInt();
            ArrayList nuevaLista = new ArrayList();
            for (int j=0;j<d;j++){
                nuevaLista.add(scan.nextInt());
            }
            vector[i]=nuevaLista;
        }
        q=scan.nextInt();
        for (int i=0;i<q;i++){
            x=scan.nextInt();
            y=scan.nextInt();
            try{
                System.out.println(vector[x-1].get(y-1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
