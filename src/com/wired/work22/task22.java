package com.wired.work22;

public class task22 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis()/1000;
        long sec = time % 60;
        time /=60;
        long min = time % 60;
        time /=60;
        long hour = time % 24;
        time /=24;
        System.out.println(time+":"+hour+":"+min+":"+sec);
    }
}
