package com.wired.work32;

import java.util.Scanner;

public class task32 {
    public static void main(String[] args) {
        //1
        /*
        Scanner scanner= new Scanner(System.in);
        double w = scanner.nextDouble();
        double gr = w * 453.6;
        int k = (int)( gr /1000);
        int g = (int)(gr - k * 1000);
        System.out.println("k="+k+"\n"+"g="+g);
        */
        //2
        int summa = 230205;
        int month = 6;
        double pr = 12.0;
        double prof = summa * pr / 100 * month /12;
        System.out.println(prof);
    }

}
