package com.company;

 class GameLauncher {
    static int systemNumber = 0;

    private int playerNum = 0;
    private int enemyNum = 0;

    private Player myPlayer = new Player();
    private Bot enemy = new Bot();

    void start() {

        System.out.println("Player life is " + Player.life);

        System.out.println("Enemy life is " + Bot.life);

        systemNumber = SystemGuess.sysGuess();

        System.out.println("Enter a number from 1 to 20");


        while (Bot.life > 0 && Player.life > 0) {
            playerNum = myPlayer.guess();
            enemyNum = enemy.guess();

            if(playerNum == systemNumber) {
                enemy.loseLife();
                enemy.setRandNum();
                if (Bot.life > 0) {
                    systemNumber = SystemGuess.sysGuess();
                    System.out.println("System thinks a new number from 1 to 20");
                }
            } else if(enemyNum == systemNumber) {
                myPlayer.loseLife();
                enemy.setRandNum();
                //System.out.println("You lose life \nYou life is " + Player.life);
                if (Player.life > 0) {
                    systemNumber = SystemGuess.sysGuess();
                    System.out.println("System thinks a new number from 1 to 20");
                }
            }
        }

        myPlayer.scanner.close();
        myPlayer.scanner.close();

        System.out.println("The game is over");
    }

    GameLauncher (int playerLife, int enemyLife) {
        Player.life= playerLife;
        Bot.life = enemyLife;
    }
}
