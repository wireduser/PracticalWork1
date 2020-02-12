package com.educadion_wired_.work46;

import java.util.Scanner;

public class task46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введи цифру -> ");
        int number = sc.nextInt();
        int summa = 0;
        do{
            int ostatok = number % 10;
            number /=  10;
            summa += ostatok*ostatok;
        }while (number != 0);
        System.out.println("Сумма квадратов цифр = " + summa);
    }
}
