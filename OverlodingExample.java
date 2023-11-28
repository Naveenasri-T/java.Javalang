public class OverlodingExample{
    //constructor
    public OverlodingExample(){
        System.err.println("Default constructor called");
    }
    public OverlodingExample(int num){
        System.out.println("parameterized constructor with integer called value:"+num);

    }
    public OverlodingExample(String str){
        System.out.println("parameterized  constructor with string called value:"+str);

    }
    //method overloding
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public String add(String str1, String str2){
        return str1+str2;
    }
    //constructor overloding 
    public static void main(String args[]){
    OverlodingExample constructorExample1=new OverlodingExample();
    OverlodingExample constructorExample2=new OverlodingExample(50);
    OverlodingExample constructorExample3=new OverlodingExample("hello java ");
    System.out.println();
    //method overloding 
    OverlodingExample methodExample = new OverlodingExample();
    int result1=methodExample.add(3,5);
    double result2=methodExample.add(3.5,10.8);
    String result3=methodExample.add("hello","oops");
    System.out.println("addition result");
    System.out.println("addition result"+result1);
    System.out.println("addition result"+result2);
    System.out.println("addition result"+result3);

    }
    
    
}