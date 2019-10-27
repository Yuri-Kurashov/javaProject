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

        systemNumber = 1 + (int) (Math.random() * 20);

        myPlayer.setSystemNum(systemNumber);
        enemy.setSystemNum(systemNumber);

        System.out.println("Enter a number from 1 to 20");

        do {
            myPlayer.guess();
            playerNum = myPlayer.guess();


            enemy.guess();
            enemyNum = enemy.guess();

            if(playerNum == systemNumber) {
                enemy.loseLife();
                enemyLife = enemy.loseLife();
            } else if(enemyNum == systemNumber) {
                myPlayer.loseLife();
                playerLife = myPlayer.loseLife();
            }

        } while (enemyLife <= 0 || playerLife <= 0);

        myPlayer.scanner.close();
        myPlayer.scanner.close();


    }

    GameLauncher (int playerLife, int enemyLife) {
        this.playerLife = playerLife;
        this.enemyLife = enemyLife;
    }



}
