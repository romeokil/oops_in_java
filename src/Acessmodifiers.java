class Account{
    String name;
    protected void displayName(String n){
        this.name=n;
        System.out.println("Type of Account is "+n);
    }
    private void display(){
        System.out.println("Showing displaying function!!");
    }
    public void show(){
        System.out.println("Show public function called!!");
        display();
    }
}
public class Acessmodifiers {
    public static void main(String[] args) {
        System.out.println("Welcome to the Access Modifier......");
        //Access modifier wali chizen aati hai 
        // whi public---> ye toh saala khi se koi bhi class se access ho skta hai
        // private--->ye toh within class bs access ho skta hai
        //protected---> ye toh access ho skte hai but dusra package me ni apna package tk me.
        Account a=new Account();
        a.displayName("Savings");
        //hmlog aisa ni access kr skte hai directly qki wo private hai eslie error dikha rha hai 
        //but apan agr tbhi chahte hai ki access kr le toh ek kaam krte hai 
        // ek or public function se usko access kr skte hai ye public function ke andr se hm private wale 
        //ko call kr lege.
        //a.display();
        a.show();
        
    }
}
