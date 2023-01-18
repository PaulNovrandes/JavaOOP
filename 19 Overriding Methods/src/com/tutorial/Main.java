package com.tutorial;

public class Main {
    
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Saitama";
        hero1.display();

        HeroStrenght hero2 = new HeroStrenght();
        hero2.name = "Almighty";
        hero2.health = 0.3;
        hero2.display();
    }
}
