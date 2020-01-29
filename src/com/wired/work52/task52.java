package com.wired.work52;

public class task52 {
    public static void main(String[] args) {
        String name = "National Aviation University";
        String abbr = "" + name.charAt(0);
        abbr += name.charAt(name.indexOf(" ") + 1);
        abbr += name.charAt(name.lastIndexOf(" ") + 1);
        System.out.println(abbr);
    }
}
