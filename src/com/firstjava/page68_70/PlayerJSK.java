package com.firstjava.page68_70;

public class PlayerJSK {
    int number = 0;
    public void guesss () {
        number = (int) (Math.random() * 10);
        System.out.println("Думаю, это число " + number);
    }
}
