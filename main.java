abstract class Animal{
    public abstract void animalSound();
    public void sleep(){
        System.out.println("ZZZZ");

    }
}
class cat extends Animal{
    public void animalSound (){

    
    System.out.println("meeowww");
    }

}
class main{
    public static void main(String[] args){
        cat obj=new cat();
        obj.animalSound();
        obj.sleep();
    }
}
