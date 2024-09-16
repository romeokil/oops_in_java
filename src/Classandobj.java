// Class are the blueprint of the object ki hamara object ka structure ky hoga kaise hoga
//Jaise ki hmlog ye car me aaram se dekh skte hai ki usme ky ky properties hai
//jaise car ka color,model,price,rating hai 

//This keyword bht kaam ka chiz hai mtlb jiske respect me usko call kiye gy hai wo uske respect me
//kaaam krne lgta hai jaise pehle c1 obj ke respect me call kiya tha then c2 object ke respect me 
//toh un particular object ke respect me kaam krne laga.
class Car{
    String name;
    String color;
    String model;
    double price;
    int rating;

    public void Carinfo(){
        System.out.println("Name of the car is "+this.name);
        System.out.println("Color of the car is "+this.color);
        System.out.println("Model of the car is "+this.model);
        System.out.println("Price of the color is "+this.price);
        System.out.println("Rating of the color is "+this.rating);
    }

}
public class Classandobj {
    public static void main(String[] args){
        System.out.println("Isme hmlog class and object bnana sikhege");

        //Object is the instance of the class mtlb bol skte hai byproduct hai jo 
        //hmaare class pe based hai.
        Car c1=new Car();
        c1.name="Tata";
        c1.color="red";
        c1.model="Nexon";
        c1.price=2000000;
        c1.rating=5;

        Car c2=new Car();
        c2.name="Maruti Suzuki";
        c2.color="blue";
        c2.model="Dzire";
        c2.price=1000000;
        c2.rating=4;

        c1.Carinfo();
        System.out.println();
        c2.Carinfo();
    }
}
