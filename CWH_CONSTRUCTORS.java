package com.company;
class base{

   base(){
        System.out.println("i am a constructor");
    }
    base(int x){
        System.out.println("i am a overloaded constructor "+x);
    }
}
class derived extends base{
    derived(){
      //  super(0);
        System.out.println("i am a derived class constructor");
    }
    derived(int x , int y){
        super(x);
        System.out.println("i am a overloaded constructor of derived with value of y as " +y);
    }

}
class childofderived extends derived{
    childofderived(){
        System.out.println(" i am a child of derived constructor");
    }
    childofderived(int x ,int y,int z){
        super(x,y);
        System.out.println("i am a overloaded constructor of derived with value of z as " +z);
    }
}


class reactangle{
    public reactangle(int l,int b){
        int area= l*b;
        int perimeter=2*(l+b);
        System.out.println("the area is:"+area);
        System.out.println("perimeter"+perimeter);
    }
}
public class CWH_CONSTRUCTORS {
    public static void main(String[] args) {
       reactangle r =new reactangle(2,6);

       base b= new base();
        derived d = new derived();
        derived id = new derived(2,7);
        childofderived cd =new childofderived();
        childofderived pd =new childofderived(12,6,9);

    }
}
