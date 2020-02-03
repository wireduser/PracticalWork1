package com.wired.work72;

import java.util.Arrays;

public class task72 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,77,0};
        System.out.println(sumOddElementsArray(array));
    }
    public static int sumOddElementsArray(int[] array){
        int result = 0;
        for (int digit : array) {
            if (digit <0) return -1;
            else if (digit % 2 > 0) result += digit;
        }
        return result;
    }
}
