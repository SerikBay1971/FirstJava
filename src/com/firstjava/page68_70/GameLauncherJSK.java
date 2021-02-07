package com.firstjava.page68_70;

// Прикольная тема. Буду дорабатывать и улучшать по мере учебы.
// Пока всего 2 недели изучения Java. 5й уровень на JavaRush.

import java.io.IOException;

public class GameLauncherJSK {
    public static void main(String[] args) throws IOException {
        GuessGameJSK game = new GuessGameJSK();
        game.startGame();
    }
}
