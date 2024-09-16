interface eye{
    void eyes();
}
interface mouth{
    void mouths();
}
interface nose{
    void noses();
}
class Person implements eye,mouth,nose{
    public void eyes(){
        System.out.println("This is eyes method of interface eye");
    }
    public void mouths(){
        System.out.println("This is mouth method of interface mouth");
    }
    public void noses(){
        System.out.println("This is nose method of interface nose");
    }
}
public class Abstract2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Abstraction 2.0 Implemeting using Interfaces");
        // ab hm bole the ki interfaces ke help se hmlog aaaram se
        // multiple inheritance implement kr skte hai
        // and then jisme base class bht saara ho skta hai and derived class ek hi ho.
        // interface construct implement ni kr skta hai.
        // esme implements keyword ka use hota jaise class me extend hota tha.
        // interface me chizen likh ni skte hai and body ni hai.
        // ab dkeho class me hmlog multiple inheritance ni kr skte the 
        // lekin interface ke through aaram se kr skte hai.

        Person p1=new Person();
        p1.eyes();
        p1.mouths();
        p1.noses();
    }
}
