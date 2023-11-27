package mypackage;

public class Main extends Mammal{
    public void sound(){
        System.out.println("sounddd");
    }
    public static void main(String args[]){
        Main m=new Main();
        m.eat();
        m.sound();
    }
}
