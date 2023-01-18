package com.tutorial;

public class HeroStrenght extends Hero{
    double health;

    /*  overriding methode -> digunakan untuk menimpa atau memodivikasi
        methode yang diinherit atau diturunkan dari super classnya. contohnya pada methode display dibawah ini, kita dapat menimpa
        isi dari methode display yang sudah ada dengan isian methode yang baru. sehingga pada sub class berikut saat dijalankan tidak
        mengikuti dari superclassnya.
    */

    void display(){
        System.out.println("nama = " + name);
        System.out.println("health = " + health);
        System.out.println("OK good!");
    }
}
