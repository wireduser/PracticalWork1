package com.educadion_wired_.work41;

public class task41 {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        int c = 10000;

        int maxValue = a;
        if (maxValue < b){
            maxValue = b;
        }
        if (maxValue < c){
            maxValue = c;
        }
        System.out.println("max -> "+maxValue);
    }
}
