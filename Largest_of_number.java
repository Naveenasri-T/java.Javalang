import java.util.Scanner;
public class Largest_of_number {
    public static void main(String args[]){
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    a=sc.nextInt();
    System.out.println("Enter a number:");
    b=sc.nextInt();
    System.out.print("Enter the number:");
    c=sc.nextInt();
    if(a>b && a>c){
        System.out.println("the larger number is:"+a);

    }
    else if(b>a && b>c){
        System.out.println("the largest number is:"+b);

    }
    else{
        System.out.println("the largest number is:"+c);
        
    }

    
    }
    
}
