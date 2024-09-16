import java.util.*;
class Area{
    int length;
    int breadth;
    int radius;

    Area(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    Area(int r){
        this.radius=r;
    }
    // ye hai polymorphism ka asli mtlb 
    // dekho esme same naaam ka do function hai but parameter different hai
    public void calculate(int l,int b){
        System.out.println("Length of the rectangle is "+l);
        System.out.println("Breadth of the rectangle is "+b);
        System.out.println("Area of the rectangle is "+(l*b));
    }
    public void calculate(int r){
        System.out.println("Radius of the circle is "+radius);
        System.out.println("Area of the circle is "+(3.14*r*r));
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("Welcome to Polymorphism.......");
        //poly+morphism= many + forms
        //mtlb chiz ek hi hai but kaam hmara 2 kr le rha hai.
        //2 types of polymorphism hota hai 
        //Compile time polymorphism-> method overloading esko hmlog abhi dekhne waale hai.
        //and runtime polymorphism-> method overriding esko inheritance me padhege

        Area a1=new Area(2,3);
        a1.calculate(2,3);
        Area a2=new Area(7);
        a2.calculate(7);
    }       
}
