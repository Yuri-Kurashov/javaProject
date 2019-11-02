package com.company;
import java.util.Scanner;

public class Player implements Play {

    private int life = 0;
    private int systemNum = 0;
    private int guessNum = 0;


    Scanner scanner = new Scanner(System.in);


    @Override
    public void setLife(int i) {
        life = i;

    }

    @Override
    public void setSystemNum(int systemNum) {
        this.systemNum = systemNum;

    }

    @Override
    public int guess() {
        guessNum = scanner.nextInt();
        if (guessNum > systemNum) {
            System.out.println("You do not guess the number \n The number is smaller");
        } else if (guessNum < systemNum) {
            System.out.println("You do not guess the number \n The number is bigger");
        } else {
            systemNum = SystemGuess.sysGuess();
            System.out.println("You guess the number \n System guess a new number from 1 to 20");
        }
        return guessNum;
    }

    @Override
    public int loseLife() {

        if (life > 0) {
            life -= 20;
        } else {
            System.out.println("You lost the game \n Enemy is winner");
        }
        return life;
    }




}
