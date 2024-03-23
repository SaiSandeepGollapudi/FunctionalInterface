package org.example.poly;

public class Main {

        public static void main(String[] args) {

            Calculator c=new Calculator();
            c.add(1,2);
            c.add(1.0,2.0);
            c.add(1.0,2.0,3.0);

        }}



//                 Overloading/Compile time
//             rules
//             1.Method name should be same
//             2.Types of parameters should be different
//             3.Number of parameters should be different
//             4.Order of parameters should be different
//             5. -> Return type does not matter here
//
//
