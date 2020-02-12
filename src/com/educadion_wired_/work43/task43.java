package com.educadion_wired_.work43;

public class task43 {
    public static void main(String[] args) {
        int line = 1;
        while (line <= 8){
            int number = line;
            while (number >= 1){
                System.out.print(number-- + " ");
                //number--;
            }
            System.out.println();
            line++;
        }
    }
}
