package com.wired.work62;

import java.util.Scanner;

public class task62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ->");
        int number = sc.nextInt();
        System.out.println("Last 2 digits -> "+ getLatestDigit(number));
    }

    public static String getLatestDigit(int number) {
        String numstring = String.valueOf(number);
        if (numstring.length()<2){
            System.out.println("Invalid args");
            return null;
        }
        String digits = numstring.substring(numstring.length()-2);
        return ""+digits.charAt(1)+digits.charAt(0);
    }
}
