package com.educadion_wired_.work13;

public class Task13 {
    public static void main(String[] args) {
        String letterJ =
                  "  + + +\n"
                + "      +\n"
                + "      +\n"
                + "+     +\n"
                + " + + +\n";
        String letterA =
                  "   +\n"
                + " +   +\n"
                + "+ + + +\n"
                + "+     +\n"
                + "+     +\n";
        String letterV =
                  "+     +\n"
                + "+     +\n"
                + "+     +\n"
                + " +   +\n"
                + "   + \n";


        System.out.println(letterJ+"\n"+letterA+"\n"+letterV+"\n"+letterA);
        int a =10;
        int x = a++ + a-- - --a;
        System.out.println(x +" "+ a);
    }
}
