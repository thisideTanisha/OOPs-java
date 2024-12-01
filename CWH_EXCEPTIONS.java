package com.company;

import java.util.Scanner;

public class CWH_EXCEPTIONS {
    public static void main(String[] args) {
        int a=6;
                int b=1;

        try{
        System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println(e);
        }finally {
            System.out.println("it's an end");
        }
        int arr[]=new int[3];
        arr[0]=2;
        arr[1]=1;
        arr[2]=4;
        Scanner s=new Scanner(System.in);
        System.out.println("enter index");
        int index=s.nextInt();
        System.out.println("number to divide with the value");
        int number =s.nextInt();
        try {
            System.out.println("the value at array index entered is"+ arr[index]);
            System.out.println("the value of array-value/number is" +arr[index]/number);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }



    }
}
