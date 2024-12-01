package com.company;

import java.util.Scanner;
class MyExeception extends Exception{
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getMessage() {
        return "i m getmessage()";
    }
}

public class CWH_EXCEPTIONS {
    public static int divide(int a,int b) throws ArithmeticException{
        int result =a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
            int c= divide(2,0);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
//        int a=6;
//                int b=1;
//        try{
//        System.out.println(a/b);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }finally {
//            System.out.println("it's an end");
//        }
//        int arr[]=new int[3];
//        arr[0]=2;
//        arr[1]=1;
//        arr[2]=4;
        Scanner s=new Scanner(System.in);
//   ®     System.out.println("enter index");
//        int index=s.nextInt();
//        System.out.println("number to divide with the value");
//        int number =s.nextInt();
//        try {
//            System.out.println("the value at array index entered is"+ arr[index]);
//            System.out.println("the value of array-value/number is" +arr[index]/number);
//        }
//        catch (ArithmeticException e) {
//            System.out.println(e);
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//      int n;
//        n=s.nextInt();
//        if(n>5){
//            try{
//               throw new MyExeception();
//            }
//            catch (Exception e){
//                System.out.println(e.getMessage());
//                System.out.println(e);// -->to run toString
//
//            }
        }



//    }
}
