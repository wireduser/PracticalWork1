package com.educadion_wired_.work72;

public class task72 {
    public static void main(String[] args) {
        int [] array = null;
        System.out.println(sumOddElementsArray(array));
    }
    public static int sumOddElementsArray(int[] array){
        if (array == null || array.length <= 1){
            return -1;
        }

        int result = 0;
        for (int digit : array) {
            if (digit <0) return -1;
            else if (digit % 2 > 0) result += digit;
        }
        return result;
    }
}
