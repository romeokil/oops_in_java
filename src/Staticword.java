class Student{
    String name;
    int age;
    static String schoolname;
}
public class Staticword {
    public static void main(String[] args) {
        System.out.println("Welcome to the static keyword........");
        // kuch baatein kr lete hai
        // static hm kisi variable,function,class,subclass kisi ko bhi bana skte hai.
        // static jisko bhi de diya usko ek hi memory share hota hai
        // and static ko object bna ke access ni krna pdta hai rather than hm class ke help se 
        // kr skte hai.
        // eska use waha krte hai jaha hmko lagta hai ki bhai ye chiz sbke liye common hi hoga
        // example students ke college/school ka naam toh saare student ke liye common hi hoga.
        Student.schoolname="DAV";
        Student s1=new Student();
        s1.name="Rahul";
        s1.age=24;
        System.out.println("Name of the student "+s1.name);
        System.out.println("Age of the student "+s1.age);
        System.out.println("Name of the school is "+s1.schoolname);
    }
}
