import java.util.Scanner;
public class Amstrong_Number {
    public static void main(String args[]) {

        System.out.println("JavaTpoint Java Compiler !!");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number :");
        int num= sc.nextInt();
        int temp= num;
        int amp=0;
        int digit = Integer.toString(num).length();
        while(temp!=0){
            int rem= temp%10;
            amp=(amp+ (int )Math.pow(rem,digit));
            temp=temp/10;
            
        }
        System.out.println(amp);
        if(amp==num){
            System.out.println("amstrong number");

        }
        else{
            System.out.println("not a amstrong number");
        }
        

    }
}
    

