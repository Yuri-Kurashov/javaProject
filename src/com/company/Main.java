
/*

Guess game
by Yuri K.

launch the game with setting player and enemy life in params of GameLauncher constructor
and realisation of start() in GameLauncher class;

System thinks a number from 1 to 20 through sysGuess() in SystemGuess class;

Player (object of Player class) and Enemy (object of Bot class) try to guess the number through guess() that implements
from Play interface;

If Player or Enemy guesses the number - opponent loses life (--20 by default) and System thinks a number from 1 to 20 again;

The loop is keep until Player.life && Bot.life !<= 0;

When Player or Enemy life is <= 0 the game is stop.

*/


package com.company;

public class Main {

    public static void main(String[] args) {
	GameLauncher newGame = new GameLauncher(80, 80);
	newGame.start();

    }
}
