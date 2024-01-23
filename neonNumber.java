import java.util.*;
public class neonNumber {
    public static void main(String args[]){
        int num,sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        num=sc.nextInt();
        int square=num*num;//9*9=81 
        while (square>0) {
            int digit=square%10;//81%10 = 1 
            sum=sum+digit; // 1         
            square= square/10; // 81/10= 8
            
        }
        if(num==sum){
            System.out.println("The given number is Neon number");//eg :num=9, 9*9=81,8+1=9 so 9 is neon number
        }
        else{
            System.out.println("The given number is not a neon number");
        }
    }
    
}
