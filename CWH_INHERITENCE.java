package com.company;
class animal{
    String colour;


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
        System.out.println("the colour of the animal is " + colour);
    }

}
class Shape{
    int area;
    public int getArea(){
        return area;
    }
}
class Rectangle extends Shape{
    int l=3;
    int b=2;
     int area=l*b;
    @Override
    public int getArea() {
        return area;
    }
}
class Box extends Rectangle{
    int surfacearea;


    @Override

    public int getArea() {
        return surfacearea;
    }
}
class dog extends animal{
    String breed;
    int pet;

    public String getBreed() {
        return breed;
        //System.out.println("the breed of the dog is :" + breed);
    }

    public void setBreed(String breed) {
        this.breed = breed;


    }
}

public class CWH_INHERITENCE {
    public static void main(String[] args) {
//        dog d =new dog();
//        d.setBreed("minion");
//        System.out.println(d.getBreed());
        Shape s =new Shape();
        System.out.println(s.getArea());
        Rectangle r =new Rectangle();
        System.out.println(r.getArea());
        Box b = new Box();
        System.out.println(b.getArea());
//

    }
}
