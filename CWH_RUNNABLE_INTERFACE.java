package com.company;
class mythr implements Runnable{
    public void run(){
        System.out.println("i m thread");
    }
}
class mythr2 implements Runnable{
    public void run(){
        System.out.println("i m thread2");
    }
}


public class CWH_RUNNABLE_INTERFACE {
    public static void main(String[] args) {
        mythr t=new mythr();
        Thread y=new Thread(t);
        y.start();
        mythr2 u=new mythr2();
        Thread r=new Thread(u);
        r.start();;

    }
}
