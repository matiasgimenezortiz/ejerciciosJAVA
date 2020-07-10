package com.datastructures;
/*
You are given a phone book that consists of people's names and their phone number. After that you will be
given some person's name as query. For each query, print the phone number of that person.

Input Format
The first line will have an integer n denoting the number of entries in the phone book. Each entry consists of two
lines: a name and the corresponding phone number.

After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.

Constraints:
A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name'
or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.
 */
import java.util.*;

public class JMap {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        HashMap phonebook = new HashMap();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            phonebook.put(name,phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(phonebook.containsKey(s)){
                System.out.println(s+"="+phonebook.get(s));
            }
            else{
                System.out.println("Not found");
            }

        }
    }
}
