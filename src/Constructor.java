class Student{
    String name;
    int age;
    int standard;

    //Default or Non-Parameterised Constructor
    Student(){
        System.out.println("Default Constructor!!!!");
    }

    //Parameterised Constructor
    Student(String n,int a,int c){
        System.out.println("Parameterised Constructor!!!!");
        this.name=n;
        this.age=a;
        this.standard=c;
    }   
    //Copy Constructor
    //ye jo copy constructor hai wo object apne parameter me leta ha.
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
        this.standard=s2.standard;
    }
    public void displayStudent(){
        System.out.println("Name of the student of is "+this.name);
        System.out.println("Age of the student is "+this.age);
        System.out.println("Class of the student is "+this.standard);
    }
}
// yaaad rkhna main class me hmlog public class className likhte hai
public class Constructor {
    public static void main(String[] args) {
        System.out.println("Welcome to Constructor............");
        //Esme hmlog constructor ke baare me padhege.
        //Constructor ka naam or class ka naam same hona chahiye 
        // Constructor ka return type ni hota hai
        //Constructor ko chizon ko initialize krne ke liye use aata hai.
        //3 types of constructor------>
        //Non Parameterised Constructor(Default Constructor),Parameterised Constructor,Default Constructor
        Student s1=new Student("Rahul",24,7);
        s1.displayStudent();
        System.out.println();
        //s2 intialize kr diya hai thik hai na
        Student s2=new Student();
        s2.name="Abhi";
        s2.age=27;
        s2.standard=5;
        System.out.println();
        //s3 object bnae and then usko s2 object argument me pass kr diye.
        Student s3=new Student(s2);
        s3.displayStudent();
    }
}
