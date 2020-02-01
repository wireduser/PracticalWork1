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
            String numbers = "";
            String line = "";
            int floor = 1;
            int countDigits;
            int countSpaces;
            int lengthLine;
            int digit;
            do {
                countSpaces = height - floor;
                countDigits = floor + floor - 1;
                lengthLine = 0;
                digit = 0;
                do {

                    if (lengthLine < countSpaces){
                        numbers += " ";
                    } else {
                        if ((lengthLine-countSpaces) >= floor) digit--;
                        else digit++;
                        numbers += digit;
                    }
                    lengthLine ++;
                } while (lengthLine < (countDigits+countSpaces) );
                line += numbers +"\n";
                numbers = "";
                floor++;
            } while (floor <= height);

            return line;
        } else return "Nothing to build!";

    }
}
