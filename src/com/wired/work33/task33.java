package com.wired.work33;

public class task33 {
    public static void main(String[] args) {
        int sum = 1000;
        double percD = 10.0;
        double percU = 7;
        double cost = sum - sum * percD / 100;
        cost += cost * percU / 100;
        System.out.println("cost =" + cost);
    }
}
