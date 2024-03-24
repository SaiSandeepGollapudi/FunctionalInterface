package org.example.poly;

import java.sql.SQLOutput;

public class Calculator {

    public int add(int a, int b){
        System.out.println("I am 1st method");
        return a+b;
    }

    public double add(double a, double b){
        System.out.println("I am 2nd method");
        return a+b;
    }

    /*
    Compilation error here, as it is not overloading.
        public String add(double b, double a){
        return null;
    }
    */
    public double add(double a, double b,double c){
        System.out.println("I am 3rd method");
        return a+b;
    }

    public int add(int a, double b){
        return a+(int)b;
    }
//here add methods both have same parameters but as the order and type is different java know if we give int first in argument then its above method
// if we give double first in argument then its below method
    public String add(double b, int a){
        return null;
    }



}