package com.tutorial;

class Player {
    String name; // default, dia akan bisa dibaca dan ditulis dari luar class
    public int exp; // public, dia akan bisa dibaca dan ditulis dari luar class
    private int health; // private, hanya bisa di baca dan ditulis dari dalam
    // class saja

    Player(String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    // default modifier access
    void display() {
        tambahExp(); // contoh mengakses private methode
        System.out.println("\nName\t " + this.name);
        System.out.println("exp\t " + this.exp);
        System.out.println("health\t " + this.health); // membaca tapi di dalam class

    }

    // // public
    public void ubahName(String nameBaru) {
        this.name = nameBaru;
    }

    // private
    private void tambahExp() {
        this.exp += 100;
    }
}

public class Main {
    public static void main(String[] args) {

        // default
        Player player1 = new Player("Marni", 0, 100);
        System.out.println(player1.name); // membaca data
        player1.name = "surti"; // menulis data
        System.out.println(player1.name); // membaca data

        // public
        System.out.println(player1.exp); // memabaca data
        player1.exp = 100; // menulis data
        System.out.println(player1.exp); // membaca data

        // private
        // System.out.println(player1.health); // memabaca data
        // player1.health = 100; // menulis data
        // System.out.println(player1.health); // membaca data

        // methods

        // default
        player1.display();

        // public
        // player1.ubahName("Tejo");
        // player1.display();

        // private (tidak bisa diakses dari luar)
        // player1.tambahExp();
    }

}
