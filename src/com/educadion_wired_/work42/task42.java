package com.educadion_wired_.work42;

import java.util.Scanner;

public class task42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter -> ");
        int x = sc.nextInt();
/*
        if (x == 0){
            System.out.println("Zero");
        }else if (x==1){
            System.out.println("One");
        }else if (x==2){
            System.out.println("Two");
        }else {
            System.out.println("Invalid value");
        }
      */
       switch (x){
           default:
               System.out.println("invalid value");
               break;
           case  0 :
               System.out.println("Zero");
               break;
           case 1:
               System.out.println("One");
               break;
           case 2:
               System.out.println("Two");
               break;

       }

    }
}
