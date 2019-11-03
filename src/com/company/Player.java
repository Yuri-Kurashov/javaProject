package com.company;
import java.util.Scanner;

public class Player implements Play {

    static int life = 0;
    private int guessNum = 0;

    Scanner scanner = new Scanner(System.in);


    @Override
    public int guess() {
        guessNum = scanner.nextInt();
        if (guessNum > GameLauncher.systemNumber) {
            System.out.println("You do not guess the number \n The number is smaller");
        } else if (guessNum < GameLauncher.systemNumber) {
            System.out.println("You do not guess the number \n The number is bigger");
        } else {
            System.out.println("You guess the number");
        }
        return guessNum;
    }

    @Override
    public int loseLife() {
        if (life > 0) {
            life -= 20;
            System.out.println("You lose life \nYour life is " + life);
            if (life <= 0)
                System.out.println("You lost the game");
        }
        return life;
    }




}
