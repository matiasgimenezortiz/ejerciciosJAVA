package com.advanced;
/*
Java allows for Covariant Return Types, which means you can vary your return type as long you are returning a subclass
of your specified return type. Method Overriding allows a subclass to override the behavior of an existing superclass
method and specify a return type that is some subclass of the original return type. It is best practice to use the
@Override annotation when overriding a superclass method.

Implement the classes and methods detailed in the diagram below:

You will be given a partially completed code in the editor where the main method takes the name of a state (i.e.,
WestBengal, or AndhraPradesh) and prints the national flower of that state using the classes and methods written by you.
Note: Do not use access modifiers in your class declarations.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Complete the classes below
class Flower {
    public String whatsYourName(){
        String s= new String();
        s= "I have many names and types.";
        return s;
    }
}

class Jasmine extends Flower{
    @Override
    public String whatsYourName(){
        String s= new String();
        s= "Jasmine";
        return s;
    }
}

class Lily extends Flower{
    @Override
    public String whatsYourName(){
        String s=new String();
        s ="Lily";
        return s;
    }
}

class Region {
    public Flower yourNationalFlower(){
        return new Flower();
    }
}

class WestBengal extends Region{
    @Override
    public Jasmine yourNationalFlower(){
        return new Jasmine();
    }
}

class AndhraPradesh extends Region{
    @Override
    public Lily yourNationalFlower(){
        return new Lily();
    }
}

public class CovariantReturnTypes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}
