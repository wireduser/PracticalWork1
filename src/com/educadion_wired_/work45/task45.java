package com.educadion_wired_.work45;

public class task45 {
    public static void main(String[] args) {
        System.out.print("* | 1  2  3  4  5  6  7  8  9\n-------------------------------");

        int multHor = 1;
        do{
            int multVer = 1;
            System.out.print("\n" + multHor + " | ");
            do{
                //System.out.print(multHor * multVer+ " ");
                int num = multHor * multVer;
                String spacer = num < 10?"  ":" ";
                System.out.print(num+spacer);
            }while (++multVer <10);
        }while (++multHor <10);
    }
}
