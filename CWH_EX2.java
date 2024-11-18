package com.company;
import java.util.Scanner;

public class CWH_EX2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter num1");
        int a= s.nextInt();
        System.out.println("enter num2");
        int b =s.nextInt();
        System.out.println("enter num3");
        int c =s.nextInt();
        int sum = a+b+c;
        System.out.println("the sum of three numbers is:");
        System.out.println(sum);
    }
}
