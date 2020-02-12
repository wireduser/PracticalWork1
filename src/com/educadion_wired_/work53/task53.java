package com.educadion_wired_.work53;

public class task53 {
    public static void main(String[] args) {
        String text = "Invented a decimal positional system "
                + "in his Sand Reckoner which was based "
                + "on 108 and later led the";
        int firstSpace = text.indexOf(" ");
        int lastSpace = text.lastIndexOf(" ");
        text = text.substring(lastSpace +1)
                + text.substring(firstSpace,lastSpace +1)
                + text.substring(0, firstSpace);
        System.out.println(text);
    }
}
