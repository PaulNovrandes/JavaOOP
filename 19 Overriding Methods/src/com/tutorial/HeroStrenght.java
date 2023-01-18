package com.tutorial;

public class HeroStrenght extends Hero{
    double health;

    /*  overriding methode -> digunakan untuk menimpa atau memodivikasi
        methode yang diinherit atau diturunkan dari super classnya.    
    */

    void display(){
        System.out.println("nama = " + name);
        System.out.println("health = " + health);
        System.out.println("OK good!");
    }
}
