package com.firstjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MyStoloto {
    // Случайный выбор чисел для лотереи Столото.
    // В Данном случае 7 из 49
    public static void main(String[] args) throws IOException {
        BufferedReader pause = new BufferedReader(new InputStreamReader(System.in));

        int ab = 49;
        int sb = 7;
        int[] allball = new int[ab];
        int[] selball = new int[sb];
        int nextball;

        // билет 1
        for (int g = 0; g < ab; g++) {
            allball[g] = g+1;
        }


        for (int g = 0; g < sb; g++) {

            nextball = (int) (Math.random() * ab);
            while (allball[nextball] == 0) {
                nextball = (int) (Math.random() * ab);
            }
            selball[g] = allball[nextball];
            allball[nextball] = 0;
        }
        System.out.print("Первый билет тиража " + sb + " из " + ab + " ");
        System.out.println(Arrays.toString(selball)); // массисв рандомно выбранных шаров

// билет 2
        for (int g = 0; g < ab; g++) {
            allball[g] = g+1;
        }


        for (int g = 0; g < sb; g++) {

            nextball = (int) (Math.random() * ab);
            while (allball[nextball] == 0) {
                nextball = (int) (Math.random() * ab);
            }
            selball[g] = allball[nextball];
            allball[nextball] = 0;
        }
        System.out.print("Второй билет тиража " + sb + " из " + ab + " ");
        System.out.println(Arrays.toString(selball)); // массисв рандомно выбранных шаров

        // билет 3
        ab = 24;
        sb = 12;
        int[] allball2 = new int[ab];
        int[] selball2 = new int[sb];

        for (int g = 0; g < ab; g++) {
            allball2[g] = g+1;
        }

        for (int g = 0; g < sb; g++) {

            nextball = (int) (Math.random() * ab);
            while (allball2[nextball] == 0) {
                nextball = (int) (Math.random() * ab);
            }
            selball2[g] = allball2[nextball];
            allball2[nextball] = 0;
        }
        System.out.print("Первый билет тиража " + sb + " из " + ab + " ");
        System.out.println(Arrays.toString(selball2)); // массисв рандомно выбранных шаров

// билет 4
        for (int g = 0; g < ab; g++) {
            allball2[g] = g+1;
        }
        // System.out.println(Arrays.toString(allball)); // весь массив "шаров"


        for (int g = 0; g < sb; g++) {

            nextball = (int) (Math.random() * ab);
            while (allball2[nextball] == 0) {
                nextball = (int) (Math.random() * ab);
            }
            selball2[g] = allball2[nextball];
            allball2[nextball] = 0;
        }
        System.out.print("Второй билет тиража " + sb + " из " + ab + " ");
        System.out.println(Arrays.toString(selball2)); // массисв рандомно выбранных шаров

        String exit = pause.readLine();

    }
}
