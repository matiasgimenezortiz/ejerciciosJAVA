package com.sttrings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {

        static boolean isAnagram(String a, String b) {
            // Complete the function
            if(a.length()!=b.length()){
                return false;
            }

            a=a.toLowerCase();
            b=b.toLowerCase();

            char[] vectora=new char[a.length()];
            char[] vectorb=new char[b.length()];

            vectora=a.toCharArray();
            vectorb=b.toCharArray();

            Arrays.sort(vectora);
            Arrays.sort(vectorb);

            boolean anagrama=true;

            for (int i=0;i<vectora.length;i++){
                if(vectora[i]!=vectorb[i]){
                    anagrama=false;
                }
            }

            return anagrama;

        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
}
