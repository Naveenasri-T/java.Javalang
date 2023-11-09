import java.util.Scanner;
public class BMI_calculation {
    public static void main(String[] args) {
        double height,weight,bmi;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the height in meters :");
        height=sc.nextDouble();
        System.out.print("Enter the weight in kg:");
        weight=sc.nextDouble();
        bmi=weight/(height*height);
        System.out.println("Body mass index is :"+bmi);
        
    }
    
}
