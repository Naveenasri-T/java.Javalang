import java.util.Scanner;
public class Odd_Even {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is Even number");

        }
        else{
            System.out.println(num+" is Odd number");
        }
    }

    
}
