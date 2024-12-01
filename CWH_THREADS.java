package com.company;
class MyThread1 extends Thread{
   @Override
    public void run(){
//       int i=0;
//       while(i<10){
       System.out.println("My Cooking thread is runnimg ");
           System.out.println("I am happy");
//           try {
//               Thread.sleep(4);
//           } catch (InterruptedException e) {
//               throw new RuntimeException(e);
//           }
//    }
       }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
//        int i=0;
//        while(i<10){
//            System.out.println(" Thread2 for chatting with her (impppppppppp)");
//            System.out.println("I am sad");
//            try {
//                Thread.sleep(4);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }
}
public class CWH_THREADS {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

//        t1.setPriority(9);
//        t2.setPriority(4);
        System.out.println(t2.getPriority());
        System.out.println(t1.getPriority());
        System.out.println(t2.getState());
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState());
        t1.start();
        t2.start();

    }
}
