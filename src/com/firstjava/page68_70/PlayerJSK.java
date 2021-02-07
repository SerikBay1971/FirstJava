package com.firstjava.page68_70;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlayerJSK {
    int number = 0;
    public void guesss () {
        number = (int) (Math.random() * 10);
        System.out.println("Думаю, это число " + number);
    }
    public void inputnum () throws IOException {
        BufferedReader num09 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Думаю, это число ");
        number = Integer.parseInt(num09.readLine());
    }
}
