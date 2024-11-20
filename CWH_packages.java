package com.company;
//import java.util.Scanner;
//import java.util.*; //not only scanner but every class of util is imported
public class CWH_packages {
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("This is my Scanner.");
        int a= sc.nextInt();
        System.out.println("This is my Scanner taking input as "+a);
    }
}
