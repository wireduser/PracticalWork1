package com.educadion_wired_.work21;

import java.util.Scanner;

public class task21 {
    public static  void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number week - ");
        int weeks = sc.nextInt();
        int sec = weeks *7*24*60*60;
        System.out.println(sec);
    }

}
