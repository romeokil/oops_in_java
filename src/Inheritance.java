class Shape{
    int color;
    public void area(){
        System.out.println("Shape class called!!");
    }
}
// ye dekho single level inheritance
class Triangle extends Shape{
    public void area(){
        System.out.println("Triangle class called!!");
    }
}
// ye dekho multilevel inheritance qki ye dekho hmlog Traingle class se extend kiye and
// Triangle class khud salaa extend hua hai Shape se eslie ye multilevel
class Equilateral extends Triangle{
    public void area(){
        System.out.println("Equilateral class called!!!");
    }
}
//ye dekho hierarchical inheritance qki es circle ka bhi parent/base class same hai triangle class ka.
class Circle extends Shape{
    public void area(){
        System.out.println("Circle class called!!");
    }
}

public class Inheritance {
    public static void main(String[] args){
        System.out.println("Welcome to the Inheritace........");
        //Inheritance naam se hi samajh aa rha hai 
        //ki hmlog chizen inherit krte hai 
        // mtlb ek ka property dusra bhi use kr skta hai 
        // jaise parent ka aadat ya behavior or face bacha me inherit ho jata hai.
        // Types of inheritance
        //Single level Inheritance->ek base class and ek derived class hota hai
        //,Multilevel Inheritance->ek se jyada base class hota hai and ek se jyada derived class hota hai.
        //,Hierarchical Inheritance->esme derived class ek se jyada hota hai and base class ek hi hota hai.
        //(abhi ye teen krege)
        //Multiple Inheritance->Interface ke through implement hota hai 
        //Hybrid Inheritance->ye basically combination hai hierarchical and multilevel inheritance ka

    }
}
