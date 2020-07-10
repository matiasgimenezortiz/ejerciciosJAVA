package com.datastructures;
/*
Given a list, l, of n integers, perform q queries on the list. Once all queries are completed,
print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer, n (the initial number of elements in l).
The second line contains n space-separated integers describing l.
The third line contains an integer, q (the number of queries).
The 2q subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers
x y, and the value y must be inserted into l at index x.
If the first line of a query contains the String Delete, then the second line contains index x,
whose element must be deleted from .
 */
import java.util.*;

public class JLinkedList {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n, q, x, y;
        ;
        String query;
        List l = new LinkedList();
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            l.add(scan.nextInt());
        }
        q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            query = new String(scan.next());
            scan.nextLine();

            if (query.equals("Insert")) {
                x = scan.nextInt();
                y = scan.nextInt();
                l.add(x, y);
            } else {
                x = scan.nextInt();
                l.remove(x);
            }
        }
        for (int i = 0; i < (l.size()); i++) {
            System.out.printf("%d ", l.get(i));
        }
    }
}
