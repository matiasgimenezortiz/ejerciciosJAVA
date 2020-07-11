package com.excephandeling;
/*
ou will be given two integers x and y as input, you have to compute x/y. If x and y are not  bit signed integers or if
y is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of
exceptions.
 */
import java.util.*;

public class JExceptionHandling {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int x,y,result;
        try{
            x=scan.nextInt();
            y=scan.nextInt();
            result=x/y;
            System.out.println(result);
        }
        catch (InputMismatchException e){

            System.out.println("java.util.InputMismatchException");

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
