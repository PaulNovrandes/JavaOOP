package com.tutorial;

// Player
class Player {
    String name;
    double health;
    int level;
    // object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    void attack(Player opponent) {
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " attaking " + opponent.name + " with power " + attackPower);

        opponent.defance(attackPower);
    }

    void defance(double attackPower) {

        // akan mengambil damage
        double damage;
        if (this.armor.defencePower < attackPower) {
            damage = attackPower - this.armor.defencePower;
        } else {
            damage = 0;
        }

        this.health -= damage;

        System.out.println(this.name + " gets damage " + damage);
    }

    void equiptWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equiptArmor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        System.out.println("\nName : " + this.name);
        System.out.println("health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

// Senjata
class Weapon {
    double attackPower;
    String name;

    Weapon(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    void display() {
        System.out.println("Weapon : " + this.name + ", Attack : " + this.attackPower);
    }

}

// armor
class Armor {
    double defencePower;
    String name;

    Armor(String name, double defencePower) {
        this.name = name;
        this.defencePower = defencePower;
    }

    void display() {
        System.out.println("Armor : " + this.name + ", defance : " + this.defencePower);
    }
}

public class Main {

    public static void main(String[] args) {
        // membuat objek player
        Player player1 = new Player("ucup", 100);
        Player player2 = new Player("otong", 50);

        // membuat objek Weapon
        Weapon pedang = new Weapon("pedang", 15);
        Weapon ketapel = new Weapon("ketapel", 10);

        // membuat objek armor
        Armor bajuBesi = new Armor("baju besi", 10);
        Armor kaos = new Armor("kaos", 0);

        // equipt senjata dan armor player1
        player1.equiptWeapon(pedang);
        player1.equiptArmor(bajuBesi);
        player1.display();

        // equipt senjata dan armor player2
        player2.equiptWeapon(ketapel);
        player2.equiptArmor(kaos);
        player2.display();

        System.out.println("\nPERTEMPURAN");
        System.out.println("\nEpisode - 1");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\nEpisode - 2");
        player2.attack(player1);
        player1.display();
        player2.display();
    }

}
