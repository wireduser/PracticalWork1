package com.wired.work74;

import java.util.Arrays;
import java.util.Scanner;

public class task74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array dimension -> ");
        int number = sc.nextInt();
        int [][]matrx= createMatrix(number);
        System.out.println("new matrix ");
        printMatrix(matrx);
        transpositionMatrix(matrx);

    }

    public static void transpositionMatrix(int[][] matrix){
        int len = matrix.length;
        int[][] tmpArray = new int [len][len];
        for (int i =0 ;  i < len; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tmpArray[i][j] = matrix[j][i];
            }
        }
        System.out.println("transposed matrix ");
        printMatrix(tmpArray);
    }

    public static int[][] createMatrix(int size){
        int [][] array = new int[size][size];
        for (int i =0 ;  i < array.length; i++){
            for (int j =0 ;  j < array[i].length; j++){
                array[i][j] = (int)(Math.random() * 50);
            }
        }
        return array;
    }
    public static void printMatrix(int[][] matrix){
        for ( int line[] : matrix){
            for (int digit : line){
                System.out.print((digit<10? "  " : " ") + digit );
            }
            System.out.println();
        }
    }
}
