package com.wired.work65;

import org.omg.CORBA.WStringSeqHelper;

public class task65 {
    public static void main(String[] args) {
        int floors = 0;
        while (floors < 11){
            System.out.println(printPyramid(floors));
            floors ++;
        }
    }
    public static String printPyramid(int height){
        if (height > 0 & height < 10){
            String spaces ="";
            String numbers = "";
            String line = "";
            int stair = 1;
            int countDigits;
            int digit;
            do {
                while (spaces.length() < (height - stair )){
                    spaces += " ";
                }
                countDigits = stair + stair -1;
                digit = 1;
                do {
                    numbers += digit;
                    if (countDigits > stair) digit++;
                    else digit --;
                    countDigits --;
                }while (countDigits != 0 );
                line += spaces + numbers +"\n";
                stair++;
                spaces = "";
                numbers = "";
            } while (stair <= height);

            return line;
        } else return "Nothing to build, he he...";

    }
}
