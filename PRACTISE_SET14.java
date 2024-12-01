package com.company;

import java.util.Scanner;
class customException extends Exception{

    @Override
    public String getMessage() {
        return "ERROR";
    }

    @Override
    public String toString() {
        return "error";
    }
}
public class PRACTISE_SET14 {
    public static void main(String[] args) {

        //q1)
        //syntax error -> int a=8

        //logical error
        int age=79;
        int year_born=2000-79;
        //exception/runtime error
       try {
           System.out.println(2/0);
       }
       catch (ArithmeticException e){
           System.out.println("haha");
       }
       catch (IllegalArgumentException e){
           System.out.println("hehe");
       }
       boolean flag=true;

       int a[]=new int[6];
       a[0]=21;
       a[1]=12;
       a[2]=33;
       a[3]=42;
       a[4]=14;
       a[5]=53;
        Scanner s =new Scanner(System.in);
        System.out.println("enter index");
        int i=0;
        while(flag && i<5) {
            try {
                int ind = s.nextInt();
                System.out.println("the index of array is:" + a[ind]);
                break;
            }
            catch (Exception e){
                System.out.println("invalid index ");
                i++;
            }
            if (i>=2) {
                try {
                    throw new customException();
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                    System.out.println(e);// -->to run toString
                }
            }

        }

    }
}
