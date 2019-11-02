package com.company;


public class Bot implements Play {

    private int life = 0;
    private int systemNum = 0;
    private int guessNum = 0;
    private int firstForRand = 1;
    private int lastForRand = 20;

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


        guessNum = firstForRand + (int) (Math.random() * lastForRand);
        System.out.println("Enemy suggest " + guessNum);
        if (guessNum > systemNum) {
            lastForRand = guessNum;
            System.out.println("last number for rand " + lastForRand);


        } else if (guessNum < systemNum) {
            firstForRand = guessNum;
            System.out.println("First number is " + firstForRand);

        } else {
            systemNum = SystemGuess.sysGuess();
            System.out.println("Enemy guess the number \n System guess a new number from 1 to 20");
        }
        return guessNum;

    }

    @Override
    public int loseLife() {
        if (life > 0) {
            life -= 20;
        } else {
            System.out.println("Enemy lost the game \n You are winner");
        }
        return life;
    }

    public void setRandNum(){
        firstForRand = 1;
        lastForRand = 20;
    }



}
