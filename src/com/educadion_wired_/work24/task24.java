package com.educadion_wired_.work24;

public class task24 {
    public static void main(String[] args) {
        int number= 123;
        int tempNumber= number;
        int ones = tempNumber % 10;
        tempNumber /= 10;
        int decs = tempNumber % 10;
        tempNumber /= 10;
        int revNumber = ones*100+decs*10+tempNumber;
        System.out.println("исходное число -"+ number+"\n"+ "обратньій порядок - "+revNumber+"\n"+ "разница - "+(number-revNumber));
    }
}
