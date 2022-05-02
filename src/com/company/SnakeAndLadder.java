package com.company;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome To Snake And Ladder Simulator ");

//        int startPosition = 0;
//        System.out.println(startPosition);

        double rollDice = (int)(Math.floor(Math.random()*10) % 6)+1;
        System.out.println("number "+rollDice);
    }
}
