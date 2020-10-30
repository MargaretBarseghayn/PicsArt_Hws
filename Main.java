package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task1\nCreate an array and fill it with 2 number.");
        int[] array1 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = 2;
        }
        System.out.println("Task2\nCreate an array and fill it with numbers from 1:1000.");
        int[] arr2 = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr2[i] = i + 1;
        }
        System.out.println("Task3\nCreate an array and fill it with odd numbers from -20:20");
        int[] arr3 = new int[20];
        for (int i = 0, j = -19; i < 10; i++, j += 2) {
            arr3[i] = j;
            arr3[20 - i - 1] = (-j);
        }
        System.out.println("Task4\nCreate an array and fill it. Print all elements which can be divided by 5.");
        int[] arr4 = {1, 5, 9, 100, 25, -954};
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] % 5 == 0) {
                System.out.print(arr4[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Task5\nCreate an array and fill it. Print all elements which are between 24.12 and 467.23.");
        double[] arr5 = {12.0, 14, 87, 1, 24, 12454.4, 26.7};
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] >= 24.12 && arr5[i] <= 467.23) {
                System.out.print(arr5[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Task6\nCreate an array and fill it. Print count of elements which can be divided by 2.");
        int[] arr6 = {1, 4, 5, 7, 8, 12, 4, 54, 5, 4};
        int countOfEvens = 0;
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] % 2 == 0) {
                ++countOfEvens;
            }
        }
        System.out.println("countOfEvens = " + countOfEvens);
        System.out.println("Task 7\n" +
                "Given an integer, 0< N < 21 , print its first 10 multiples. \n" +
                "Each multiple  N x i (where 0<i<11) should be printed on a new line in the form: N x i = result.");
        int n = 5;
        for (int i = 1; i < 11; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
        System.out.println("Bonus Task\nCreate an array and fill it. Print all elements which are power of 2");
        for (int i = 0; i < arr6.length; i++) {
            if (((arr6[i] - 1) & arr6[i]) == 0) {
                System.out.print(arr6[i] + " ");
            }
        }
    }
}
