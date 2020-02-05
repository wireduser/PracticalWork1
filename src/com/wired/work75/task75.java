package com.wired.work75;

import java.util.Arrays;
import java.util.Scanner;

public class task75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number -> ");
        String number = sc.nextLine();
        System.out.println(Arrays.toString(countOfSequenceNumbers_easy(number)));
    }
    public static int[] countOfSequenceNumbers(String numbers){
        int[] counts = new int [10];
        for (int i = 0; i < 10; i++){
            int numCount = 0;
            int index = 0;
            for(;;){
                index = numbers.indexOf((char)(i+'0'),index);
                if (index >=0) {
                    numCount++;
                    index +=1;
                }
                else break;
            }
            counts[i] = numCount;
        }
        return counts;
    }

    public static int[] countOfSequenceNumbers_easy(String numbers){
        int[] counts = new int [10];
        String digits = "0123456789";
        for (int i = 0; i < numbers.length(); i++){
            char symbol = numbers.charAt(i);
            int index = digits.indexOf(symbol);
            if (index != -1){
                counts[index]++;
            }
        }
        return counts;
    }
}
