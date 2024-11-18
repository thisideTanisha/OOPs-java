package com.company;

import java.util.Scanner;

public class CWH_EX8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       int a=s.nextInt();
       System.out.println(a>8);
        int v=9;
        int u=3;
        int a2=9;
        int s1=9;
        int ans=(v*v-u*u)/2*a2*s1;
        System.out.println(ans);
        int x=7;


     int b =(int)(7.49/7)*(35/7);
        System.out.println(b);


        String name ="   Harry  ";
        System.out.println(name);
        int length = name.length();
        System.out.println(length);
        String lower = name.toLowerCase();
        System.out.println(lower);
        String upper = name.toUpperCase();
        System.out.println(upper);
        String trim = name.trim();
        System.out.println(trim);
        System.out.println(trim.substring(3));
        System.out.println(trim.substring(2,5));
        System.out.println(trim.replace('r','p'));
        System.out.println(trim.startsWith("HA"));
        System.out.println(trim.startsWith("Ha"));
        System.out.println(trim.endsWith("y"));
        System.out.println(trim.charAt(4));
        System.out.println(trim.indexOf("h"));
        System.out.println(trim.indexOf("H"));
        System.out.println(trim.indexOf("r",3));



    }
}
