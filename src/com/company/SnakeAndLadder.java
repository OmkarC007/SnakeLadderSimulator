package com.company;

import java.lang.management.MemoryType;

public class SnakeAndLadder {


    public static void main(String[] args) {
        System.out.println("Welcome To Snake And Ladder Simulator ");

        int startPosition = 0;
        final int noPlay = 0;
        final int ladder = 1;
        final int snake = 2;

        int playerPosition = 0;

        int diceRoll =(int) (Math.floor(Math.random() *10 )%6) + 1;
        int playerOption   = (int) (Math.floor(Math.random() * 10 )% 3);

        switch (playerOption){
            case ladder :
                playerPosition = playerPosition +diceRoll;
                System.out.println(playerPosition);
                break;
            case snake :
                playerPosition= playerPosition - diceRoll;
                System.out.println(playerPosition);

                break;
            default:
                break;
        }
    }
}
