package com.wired.work23;

public class task23 {
    public static void main(String[] args) {
        int var1 =2147483647;
        int var2 =2147483646;
        var1 = var1+var2;
        var2 = var1-var2;
        var1 = var1-var2;

        System.out.println("var1="+var1);
        System.out.println("var2="+var2);
        int val = Integer.MAX_VALUE +1;
        System.out.println(val);
        System.out.println(Integer.MAX_VALUE);

    }
}
