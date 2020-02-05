package com.wired.work64;

import java.util.Scanner;

public class task64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ->");
        int number = sc.nextInt();
        System.out.println(convertDecimalToBinary(number));

    }
    public static String convertDecimalToBinary (int number){
        //int maxIntWordLength = 32;
        char charBit;
        //int currentBit = 0;
        String word ="";
        while (number > 0){
            charBit = number % 2 != 0 ? '1' : '0';
            number /= 2;
            word = charBit + word;
            //currentBit ++;
        }
        return word;
    }
}
