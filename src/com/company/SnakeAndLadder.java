package com.company;

import com.sun.tools.jconsole.JConsoleContext;

import javax.xml.stream.events.StartDocument;
import java.lang.management.MemoryType;

public class SnakeAndLadder {


    public static void main(String[] args) {
        System.out.println("Welcome To Snake And Ladder Simulator ");

        int startPosition = 0;
        final int noPlay = 0;
        final int ladder = 1;
        final int snake = 2;
        final int winningPosition = 100;


        int playerPosition = 0;

        while(playerPosition < winningPosition){

            int diceRoll =(int) (Math.floor(Math.random() *10 )%6) + 1;
            int playerOption   = (int) (Math.floor(Math.random() * 10 )% 3);

            switch (playerOption){
                case ladder :
                    if((playerPosition + diceRoll) <= winningPosition){
                        playerPosition = playerOption + diceRoll;
                    }
                    break;
                case snake :
                    if((playerPosition - diceRoll) <= startPosition){
                        playerPosition = startPosition;
                    }else{
                        playerPosition = playerPosition -diceRoll;
                    }
                    break;
                default:
                    break;
            }
            System.out.println("player Position" +playerPosition);
        }
    }
}
