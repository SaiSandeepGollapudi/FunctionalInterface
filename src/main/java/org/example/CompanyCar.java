package org.example;
//extends -> inherit the properties -> applicable for 'class -> class' or 'interface -> interface'
public interface CompanyCar extends Car {

    void openAirBag();//Interface methods are by default abstract and public

    void closeAirBag();

    default void addFrontLogo(int name){
        System.out.println("I am coming from interface with default method");
    }
}
