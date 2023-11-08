import java.util.Scanner;
public class sum_of_numbers {
    public static void main(String[] args) {
        int n,sum;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        n=sc.nextInt();
        sum=n*(n+1)/2;
        System.out.println("Sum of the numbers:"+sum);
    }
    
}
