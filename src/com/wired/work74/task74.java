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
        System.out.println("transposed matrix");
        printMatrix(matrx);
    }

    public static void transpositionMatrix(int[][] matrix){
        int temp;

        for (int i =0 ;  i < matrix.length; i++) {
            for (int j = i ; j < matrix[i].length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
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
                System.out.print(String.format("%3d",digit));
            }
            System.out.println();
        }
    }
}
