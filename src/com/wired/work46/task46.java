package com.wired.work46;

import java.util.Scanner;

public class task46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter -> ");
        int x = sc.nextInt();
        int summa = 0;
        do{
            int ostatok = x % 10;
            x = x / 10;
            int sqr = ostatok*ostatok;
            summa = summa + sqr;
        }while (x !=0);
        System.out.println("Сумма квадратов цифр = " + summa);
    }
}
