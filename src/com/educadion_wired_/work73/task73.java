package com.educadion_wired_.work73;

import java.util.Scanner;

public class task73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array dimension -> ");
        int number = sc.nextInt();
        drawArray(createMatrix(number));
    }

    public static int[][] createMatrix(int size){
        int [][] array = new int[size][size];
        for (int i =0 ;  i < array.length; i++){
            for (int j =0 ;  j < array[i].length; j++){
                array[i][j] = size * j + i + 1;
            }
        }
        return array;
    }

    public static void drawArray (int[][] array){
        for ( int line[] : array){
            for (int digit : line){
                System.out.print(String.format("%3d",digit));
            }
            System.out.println();
        }
    }
}
