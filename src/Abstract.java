abstract class Animal{
    Animal(){
        System.out.println("Animal has created!!");
    }
    // yaad rkhna abstract method ka body base class me ni ho skta hai usko hmlog derived class me 
    // body daalke override kr skte hai.
    abstract void warning();
    public void walk(){
        System.out.println("Animal can easily walk!!!");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse has created!!");
    }
    public void warning(){
        System.out.println("Horse can kick you!!");
    }
}
class Lion extends Animal{
    Lion(){
        System.out.println("Lion has created!");
    }
    public void warning(){
        System.out.println("Lion can eat you even. Be Careful!!!");
    }
}
public class Abstract {
    public static void main(String[] args){
        System.out.println("Welcome to Abstraction!!");
        // abstraction ka mtlb hai ki kuch chizon ko dikhana and kuch chizon ko chupa lena
        // qki unneccessary info dikhane ka koi mtlb ni hai na 
        // or unneccessary sara info ko access sbko dena bhi shi ni hai eslie.
        // Base class ka constructor pehle call hota hai and then derived class ka constructor call hota hai.
        Horse h1=new Horse();
        h1.warning();
        Lion l1=new Lion();
        l1.warning();
    }
}
