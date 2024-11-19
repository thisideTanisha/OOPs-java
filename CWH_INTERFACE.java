package com.company;
interface bicycle{
    int a=45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements bicycle{
    void blowhorn(){
        System.out.println("pee pee pee pee");
    }
    public void applyBrake(int decrement) {
        System.out.println("applying brake");
    }
    public void speedUp(int increment) {
        System.out.println("applying speedup ");
    }
}
public class CWH_INTERFACE {
    public static void main(String[] args) {
        AvonCycle cycleHarry =new AvonCycle();
        cycleHarry.applyBrake(1);
        //cycleharry.a=23;--->error as it is already finalised in interface cannot be changed
        System.out.println(cycleHarry.a);
    }
}
