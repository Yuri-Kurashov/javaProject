package com.company;


public class Bot implements Play {

    static int life = 0;
    private int guessNum = 0;
    private int firstForRand = 1;
    private int lastForRand = 20;

    @Override
    public int guess() {

        guessNum = firstForRand + (int) (Math.random() * lastForRand);
        System.out.println("Enemy suggest " + guessNum);
        if (guessNum > GameLauncher.systemNumber) {
            lastForRand = guessNum - firstForRand;
            System.out.println("First number is " + firstForRand);
            System.out.println("last number for rand " + lastForRand);
        } else if (guessNum < GameLauncher.systemNumber) {
            firstForRand = guessNum + 1;
            lastForRand -= (firstForRand - 1);
            System.out.println("First number is " + firstForRand);
            System.out.println("last number for rand " + lastForRand);
        } else {
            System.out.println("Enemy guess the number");
        }
        return guessNum;
    }

    @Override
    public int loseLife() {
        if (life > 0) {
            life -= 20;
            System.out.println("Enemy lose life \nEnemy life is " + life);
            if (life <= 0)
                System.out.println("Enemy lost the game");
            }

        return life;
    }

    void setRandNum(){
        firstForRand = 1;
        lastForRand = 20;
    }



}
