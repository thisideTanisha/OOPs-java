package com.company;
import java.util.Scanner;

public class CWH_EX3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter marks1");
        float a =s.nextFloat();
        System.out.println("enter marks2");
        float b =s.nextFloat();
        System.out.println("enter marks3");
        float c =s.nextFloat();
        float sum = a+b+c;
        System.out.println("the total sum of marks obtained ");
        System.out.println(sum);
        float CGPA = sum/300;
        System.out.println("The cgpa of the student is:");
        System.out.println(CGPA);
    }




}
