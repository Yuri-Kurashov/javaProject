package com.company;

 class GameLauncher {
    private int systemNumber = 0;

    private int playerLife;
    private int enemyLife;

    private int playerNum = 0;
    private int enemyNum = 0;

    private Player myPlayer = new Player();
    private Bot enemy = new Bot();

    void start() {

        myPlayer.setLife(playerLife);
        System.out.println("Player life is " + playerLife);
        enemy.setLife(enemyLife);
        System.out.println("Enemy life is " + enemyLife);

        if(playerLife <= 0 || enemyLife <= 0) {
            System.out.println("Player life or enemy life is zero \n Set life above zero");
            return;
        }


        systemNumber = SystemGuess.sysGuess();


        myPlayer.setSystemNum(systemNumber);
        enemy.setSystemNum(systemNumber);

        System.out.println("Enter a number from 1 to 20");

        do {
           // myPlayer.guess();
           // enemy.guess();
            playerNum = myPlayer.guess();
            enemyNum = enemy.guess();

            if(playerNum == systemNumber) {
                enemyLife = enemy.loseLife();
                enemy.setRandNum();
                System.out.println("Enemy lose life \nEnemy life is " + enemyLife);
            } else if(enemyNum == systemNumber) {
                playerLife = myPlayer.loseLife();
                enemy.setRandNum();
                System.out.println("You lose life \nYou life is " + playerLife);
            }

        } while (enemyLife >= 0 || playerLife >= 0);

        myPlayer.scanner.close();
        myPlayer.scanner.close();

        System.out.println("The game is over");

        return;
    }

    GameLauncher (int playerLife, int enemyLife) {
        this.playerLife = playerLife;
        this.enemyLife = enemyLife;
    }



}
