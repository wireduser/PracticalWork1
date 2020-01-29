package com.wired.work54;

public class task54 {
    public static void main(String[] args) {
        String word1 = "Cartoon";
        String word2 = "Tomcat";
        int size = word1.length();
        int index = 0;
        while (index < size){
            char symbol = word1.charAt(index);
            if (word2.indexOf(symbol) < 0){
                System.out.print(symbol+" ");
            }
            index++;
        }
    }
}
