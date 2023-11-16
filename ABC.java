public class ABC {
    public void display(){
        System.out.println("method parent class");

    }
}
class Demo extends ABC{
    public void display(){
        System.out.println("method child class");

    }

    public static void main(String[] args) {
        ABC obj=new ABC();
        obj.display();
        ABC ob2=new Demo();
        ob2.display();
        

      }  
}




