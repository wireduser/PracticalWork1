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
            int floor = 1;
            int countDigits;
            int digit;
            do {
                while (spaces.length() < (height - floor )){
                    spaces += " ";
                }
                countDigits = floor + floor - 1;
                digit = 1;
                do {
                    numbers += digit;
                    if (countDigits > floor) digit++;
                    else digit --;
                    countDigits --;
                }while (countDigits != 0 );
                line += spaces + numbers +"\n";
                spaces = "";
                numbers = "";
                floor++;
            } while (floor <= height);

            return line;
        } else return "Nothing to build!";

    }
}
