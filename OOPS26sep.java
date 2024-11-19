package com.company;
import java.util.Scanner;

class Vehicle{
    public void display(){

      System.out.println("This is a Vehicle");
  }
}
class Car extends Vehicle{
    public void display(){
       System.out.println("This is a car");
    }

}
class Bike extends Car{
    public void display(){

        System.out.println("This is a bike");
    }

}
class X{
    int a=10;
    X(int a){
        this();
        a=30;
        System.out.println(this.a);
        System.out.println(a);
    }
    X(){
        System.out.println(this.a);
        System.out.println(a);
    }
}


public class OOPS26sep {
    public static void main(String[] args) {

        //methods overriding
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        if (n == 2) {
//            Bike b = new Bike();
//            b.display();
//        }
//        if (n == 4) {
//            Car c = new Car();
//            c.display();
//        }
//        if(n!=2 && n!=4) {
//            Vehicle v = new Vehicle();
//            v.display();
//        }
//        X x=new X();
        X px=new X(1);

    }
}
