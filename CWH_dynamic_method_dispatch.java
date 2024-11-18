package com.company;
class phone{
    public void showtime(){
        System.out.println("Time is 8 pm");
    }
    public  void on(){
        System.out.println("my name in JAVA");
    }
}
class smartphone extends phone{
    public void MUSIC(){
        System.out.println("Apka swagat HA");
    }
    public  void on(){
        System.out.println("my name is JAVA in Class two");
    }
}

public class CWH_dynamic_method_dispatch {
    public static void main(String[] args) {
        //phone obj= new phone();
        phone obj = new smartphone();
//        obj.showtime();
        obj.on();
     //not allowed   obj.MUSIC();

    }
}
