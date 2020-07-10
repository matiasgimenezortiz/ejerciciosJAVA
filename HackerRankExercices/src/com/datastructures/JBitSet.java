package com.datastructures;
/*
Java's BitSet class implements a vector of bit values (i.e.: false(0) or true(1)) that grows as needed, allowing us
to easily manipulate bits while optimizing space (when compared to other collections). Any element having a bit value
of 1 is called a set bit.

Given 2 BitSets, conjunto1 and conjunto2, of size n where all bits in both BitSets are initialized to 0, perform a
series of m operations.
After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a
new line.

Input Format
The first line contains 2 space-separated integers, n (the length of both BitSets conjunto1 and conjunto2) and
m (the number of operations to perform), respectively.
The m subsequent lines each contain an operation in one of the following forms:

AND <SET> <SET>
OR <SET> <SET>
XOR <SET> <SET>
FLIP <SET> <INDEX>
SET <SET> <INDEX>

In the list above, <SET> is the integer 1 or 2, where 1 denotes conjunto1 and 2 denotes conjunto2.
<INDEX> is an integer denoting a bit's index in the BitSet corresponding to <SET>.
For the binary operations AND, OR, and XOR, operands are read from left to right and the BitSet resulting
from the operation replaces the contents of the first operand.

Output Format
After each operation, print the respective number of set bits in BitSet conjunto1 and BitSet conjunto2 as
2 space-separated integers on a new line.
 */

import java.util.*;

public class JBitSet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n,m,op1,op2;
        n=scan.nextInt();
        m=scan.nextInt();
        String op;

        BitSet conjunto1=new BitSet(n);
        BitSet conjunto2=new BitSet(n);

        for(int i=0;i<m;i++){
            op=scan.next();
            op1=scan.nextInt();
            op2=scan.nextInt();
            switch(op){
                case "AND":
                    if(op1==1){
                        conjunto1.and(conjunto2);
                    }else{
                        conjunto2.and(conjunto1);
                    }
                    break;
                case "OR":
                    if(op1==1){
                        conjunto1.or(conjunto2);
                    }else{
                        conjunto2.or(conjunto1);
                    }
                    break;
                case "XOR":
                    if(op1==1){
                        conjunto1.xor(conjunto2);
                    }else{
                        conjunto2.xor(conjunto1);
                    }
                    break;
                case "SET":
                    if(op1==1){
                        conjunto1.set(op2);
                    }else{
                        conjunto2.set(op2);
                    }
                    break;
                case "FLIP":
                    if(op1==1){
                        conjunto1.flip(op2);
                    }else{
                        conjunto2.flip(op2);
                    }
                    break;
            }
            System.out.println(conjunto1.cardinality()+" "+conjunto2.cardinality());
        }

    }
}