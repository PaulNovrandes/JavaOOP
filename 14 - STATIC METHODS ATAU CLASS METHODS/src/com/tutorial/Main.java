package com.tutorial;

import java.util.ArrayList;

class Player {
    private static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();

    private String name;

    Player(String name) {
        this.name = name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.name);

    }

    void show() {
        System.out.println("Player name = " + this.name);
    }

    static void showNumberOfPlayer(){
        System.out.println("Number of Player = "+ Player.numberOfPlayer);
    }

    static ArrayList<String> getName(){
        return Player.nameList;
    }
}

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Posaidon");
        Player player2 = new Player("Zeus");
        Player player3 = new Player("Kratos");
        Player player4 = new Player("Achiles");

        Player.showNumberOfPlayer();

        System.out.println("Names\t" + Player.getName());
        
    }
}
