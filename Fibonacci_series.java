import java.util.*;
public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int first=0;
        int second=1;
        System.out.println("the Fibonacci series: ");
        for(int i=0; i<=num;i++){
            System.out.println(+first+ " ");
            int third=first+second;
            first=second;
            second=third;
        }
    }
    
}
