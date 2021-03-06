package com.datastructures;
/*
A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2.
if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.
Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
Given a string, determine if it is balanced or not.

Input Format
There will be multiple lines in the input file, each having a single non-empty string. You should read input
till end-of-file.
The part of the code that handles input operation is already provided in the editor.

Output Format
For each case, print 'true' if the string is balanced, 'false' otherwise.

Sample Input
{}()
({()})
{}(
[]
Sample Output
true
true
false
true
 */
import java.util.*;

public class JStack {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        Stack<String> pila1;
        Stack<String> pila2;

        while (sc.hasNext()) {
            String input=sc.next().trim();
            pila1 = new Stack<String>();
            pila2 = new Stack<String>();

            for (int i=0;i<input.length();i++){
                pila1.push(input.substring(i,i+1));
            }


            while(!pila1.empty()){

                if(pila2.empty()){
                    pila2.push(pila1.pop());
                }

                if((pila1.peek().equals("(") && pila2.peek().equals(")")) ||
                        (pila1.peek().equals("[") && pila2.peek().equals("]")) ||
                        (pila1.peek().equals("{") && pila2.peek().equals("}"))){
                    pila1.pop();
                    pila2.pop();
                }else{
                    pila2.push(pila1.pop());
                }
            }

            if(pila1.empty()&&pila2.empty()){
                System.out.println("true");
            }else{
                System.out.println("false");
            }

        }

    }
}
