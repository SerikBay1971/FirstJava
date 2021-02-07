package com.firstjava.page68_70;

import java.io.IOException;

public class GuessGameJSK {
    PlayerJSK p1;
    PlayerJSK p2;
    PlayerJSK p3;

    public void startGame() throws IOException {
        p1 = new PlayerJSK();
        p2 = new PlayerJSK();
        p3 = new PlayerJSK();

        int guessp1;
        int guessp2;
        int guessp3;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        String p1wow = "Неееет!";
        String p2wow = "Неееет!";
        String p3wow = "Неееет!";

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Ведущий: ДОБРО ПОЖАЛОВАТЬ!!! (бурные аплодисменты, крики 'Привееет', 'Ты супееер!')");
        System.out.println("Это игра на угадывание чисел...");
        System.out.println("Всё просто! Я загадыываю число от 0 до 9...");
        System.out.println();
        System.out.println("... и помещаю листок с загаданным числом в конверт.");
        // System.out.println("Вам, зрителям, по большому секрету, скажу - число, которое я загадал, - " + targetNumber);
        System.out.println("Вам, зрителям, по большому секрету, скажу - число, которое я загадал, - ага, щассс!!");

        while (true) {
            System.out.println("Игроки, вы готовы угадать число?");
            System.out.println();

            System.out.print("1. ");
            p1.inputnum();
            System.out.print("2. ");
            p2.inputnum();
            System.out.print("3. ");
            p3.guesss();
            System.out.println();

            System.out.println("Ведущий:");
            guessp1 = p1.number;
            System.out.println("Первый игрок думает, что это " + guessp1);
            guessp2 = p2.number;
            System.out.println("Второй игрок думает, что это " + guessp2);
            guessp3 = p3.number;
            System.out.println("Третий игрок думает, что это " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
                p1wow = "Дааааа!!!";
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
                p2wow = "Дааааа!!!";
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
                p3wow = "Дааааа!!!";
            }

            if (p1isRight || p2isRight || p3isRight) {


                System.out.println("У НАС ЕСТЬ ПОБЕДИТЕЛЬ!!!");
                System.out.println();
                System.out.println("Первый игрок угадал? Зал: " + p1wow);
                System.out.println("Второй игрок угадал? Зал: " + p2wow);
                System.out.println("Третий игрок угадал? Зал: " + p3wow);
                System.out.println("ПОЗРАВЛЯЕМ С ПОБЕДОЙ! (продолжительные аплодисменты) Конец игры!!!"); // Здесь можно будет обозначить выигравших
                break;
            } else {
                System.out.println("НИКТО НЕ УГАДАЛ! (Зал: нуууу-у-у--у---у...)");
                System.out.println("Игроки должны попробовать еще раз! (ободряющие аплодисменты)");
                System.out.println();

            }
        }
    }
}

